import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.sql.Sql as Sql
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.event.KeyEvent as KeyEvent
import file.uploadFile as uploadFile

/*sql = Sql.newInstance((((('jdbc:oracle:thin:@' + (GlobalVariable.ConexionDB[0])) + ':') + (GlobalVariable.ConexionDB[1])) + 
    ':') + (GlobalVariable.ConexionDB[2]), GlobalVariable.ConexionDB[3], GlobalVariable.ConexionDB[4], GlobalVariable.ConexionDB[
    5])
*/
WebUI.openBrowser(GlobalVariable.home)

WebUI.navigateToUrl(GlobalVariable.home)

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[1])

WebUI.click(findTestObject('Cliente/Crear Solicitud/IniciarSesionButton'))

WebUI.click(findTestObject('Cliente/Crear Solicitud/TipoUsuarioImg', [('text') : Cliente]))

WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/TipoDocumentoSelect'), GlobalVariable.userCliente[0], 
    true)

WebUI.setText(findTestObject('Cliente/Crear Solicitud/NumeroInput'), GlobalVariable.userCliente[1])

WebUI.setText(findTestObject('Cliente/Crear Solicitud/ContrasenaInput'), GlobalVariable.userCliente[2])

WebUI.click(findTestObject('Cliente/Crear Solicitud/LoginButton'))

for (fila = 1; fila <= findTestData(DataFile).getRowNumbers(); fila++) {
    WebUI.delay(1)

    WebUI.click(findTestObject('Cliente/Crear Solicitud/CrearSolicitudButton'))

    WebUI.verifyElementText(findTestObject('Cliente/Crear Solicitud/MensajeHeader'), GlobalVariable.Mensaje[0])

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/FechaDocumentoInput'), findTestData(DataFile).getValue(campo[0], 
            fila))

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/FechaNacimientoInput'), findTestData(DataFile).getValue(campo[
            1], fila))

    WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/DepartamentoResidenciaSelect'), findTestData(DataFile).getValue(
            campo[2], fila), true)

    WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/CiudadResidenciaSelect'), findTestData(DataFile).getValue(
            campo[3], fila), true)

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/BarrioResidenciaInput'), findTestData(DataFile).getValue(campo[
            4], fila))

    WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/EstadoCivilSelect'), findTestData(DataFile).getValue(
            campo[5], fila), true)

    WebUI.click(findTestObject('Cliente/Crear Solicitud/SeguridadSocialRadio', [('index') : findTestData(DataFile).getValue(
                    campo[6], fila)]))

    WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/NivelestudioSelect'), findTestData(DataFile).getValue(
            campo[7], fila), true)

    WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/TipoViviendaSelect'), findTestData(DataFile).getValue(
            campo[8], fila), true)

    WebUI.selectOptionByValue(findTestObject('Cliente/Crear Solicitud/AnoActivosSelect'), findTestData(DataFile).getValue(
            campo[9], fila), true)

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/NivelactivosInput'), findTestData(DataFile).getValue(campo[10], 
            fila))

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/MontoInput'), findTestData(DataFile).getValue(campo[11], fila))

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/PersonasCargoInput'), findTestData(DataFile).getValue(campo[12], 
            fila))

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/PlazoInput'), findTestData(DataFile).getValue(campo[13], fila))

    WebUI.setText(findTestObject('Cliente/Crear Solicitud/DestinoTextArea'), findTestData(DataFile).getValue(campo[14], 
            fila))

    WebUI.sendKeys(findTestObject('Cliente/Crear Solicitud/DestinoTextArea'), Keys.chord(Keys.TAB, Keys.SPACE))

    /*Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_SPACE)

    robot.keyRelease(KeyEvent.VK_SPACE)*/
    WebUI.waitForElementClickable(findTestObject('Cliente/Crear Solicitud/AccionButton', [('index') : 1]), 0)

    'Botón guardar'
    WebUI.click(findTestObject('Cliente/Crear Solicitud/AccionButton', [('index') : 1]))

    WebUI.verifyTextPresent('Su solicitud ha sido creada con el número', false)

    WebUI.waitForElementClickable(findTestObject('Cliente/Crear Solicitud/AccionButton', [('index') : 2]), 0)

    'Botón siguiente'
    WebUI.click(findTestObject('Cliente/Crear Solicitud/AccionButton', [('index') : 2]))

    for (def count = 1; count <= 9; count++) {
        WebUI.click(findTestObject('Cliente/Crear Solicitud/SubirArchivoButton', [('index') : count]))

        switch (count) {
            case 5:
                CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Datos.xlsx')

                break
            case 9:
                CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Video.mp4')

                break
            default:
                CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Archivo.pdf')

                break
        }
        
        WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.click(findTestObject('Cliente/Crear Solicitud/FotosButton', [('index') : 29]))

    CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Imagen.jpg')

    WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Cliente/Crear Solicitud/FotosButton', [('index') : 31]))

    CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Imagen.jpg')

    WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Cliente/Crear Solicitud/FotosButton', [('index') : 33]))

    CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Imagen.jpg')

    WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Cliente/Crear Solicitud/FotosButton', [('index') : 35]))

    CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Imagen.jpg')

    WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

    'Botón Crear solicitud'
    WebUI.click(findTestObject('Cliente/Crear Solicitud/AccionButton', [('index') : 1]))

    GlobalVariable.Solicitud = WebUI.getAttribute(findTestObject('Cliente/Crear Solicitud/NoSolicitudLabel'), 'innerText')

    WebUI.click(findTestObject('Cliente/Crear Solicitud/FinalizarButton'))

}

