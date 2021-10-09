import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import file.uploadFile as uploadFile
import groovy.sql.Sql as Sql
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

sql = Sql.newInstance((((('jdbc:oracle:thin:@' + (GlobalVariable.ConexionDB[0])) + ':') + (GlobalVariable.ConexionDB[1])) + 
    ':') + (GlobalVariable.ConexionDB[2]), GlobalVariable.ConexionDB[3], GlobalVariable.ConexionDB[4], GlobalVariable.ConexionDB[
    5])

def nit = sql.firstRow(('select numero_documento from neo_cliente where numero_documento=\'' + findTestData(DataFile).getValue(
        campo[0], 1)) + '\'')

WebUI.comment('el nit es: ' + nit)

if (nit != null) {
    WebUI.comment(('El numero de Nit ' + nit.numero_documento) + ' ya existe, debe usar otro Nit')

    WebUI.closeBrowser()
}

WebUI.navigateToUrl('http://172.31.10.14:8080/ngneocredito/#/bancoldex/login')

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[1])

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/UsuarioLoginInput'), GlobalVariable.userBancoldex[0])

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/ContrasenaLoginInput'), GlobalVariable.userBancoldex[1])

WebUI.click(findTestObject('Bancoldex/Crear Intermediario/IniciarSesionButton'))

WebUI.click(findTestObject('Bancoldex/Crear Intermediario/MenuButton'))

WebUI.click(findTestObject('Bancoldex/Crear Intermediario/MenuAdministracionButton'))

WebUI.click(findTestObject('Bancoldex/Crear Intermediario/MenuCrearAliadoFinancieroButton'))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/NitInput'), findTestData(DataFile).getValue(campo[0], 1))

WebUI.click(findTestObject('Bancoldex/Crear Intermediario/BuscarButton'))

WebUI.click(findTestObject('Bancoldex/Crear Intermediario/RegistrarAPCButton'))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/PrimeNombreInput'), findTestData(DataFile).getValue(campo[1], 
        1))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/SegundoNombreInput'), findTestData(DataFile).getValue(campo[
        2], 1))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/PrimerApellidoInput'), findTestData(DataFile).getValue(campo[
        3], 1))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/SegundoApellidoInput'), findTestData(DataFile).getValue(campo[
        4], 1))

WebUI.selectOptionByValue(findTestObject('Bancoldex/Crear Intermediario/TipoDocumentoSelect'), findTestData(DataFile).getValue(
        campo[5], 1), true)

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/NumeroDocumentoInput'), findTestData(DataFile).getValue(campo[
        6], 1))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/CargoInput'), findTestData(DataFile).getValue(campo[7], 1))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/CorreoInput'), findTestData(DataFile).getValue(campo[8], 1))

WebUI.setText(findTestObject('Bancoldex/Crear Intermediario/CelularInput'), findTestData(DataFile).getValue(campo[9], 1))

//WebUI.click(findTestObject('Bancoldex/Crear Intermediario/FormatoAPCButton', [('index') : 1]))
//CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Archivo.pdf')
//WebUI.delay(15)
//WebUI.click(findTestObject('Bancoldex/Crear Intermediario/FormatoAPCButton', [('index') : 2]))
//CustomKeywords.'file.uploadFile.upload'('\\Data Files\\Archivo.pdf')
//WebUI.delay(5)
WebUI.click(findTestObject('Bancoldex/Crear Intermediario/AceptarButton'))

WebUI.verifyElementText(findTestObject('Bancoldex/Crear Intermediario/MensajeExitosoLabel'), 'Exito registro de Intermediario y Administrador')
WebUI.delay(5)
WebUI.click(findTestObject('Bancoldex/Crear Intermediario/HomeLink'))

