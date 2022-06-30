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

/*sql = Sql.newInstance((((('jdbc:oracle:thin:@' + (GlobalVariable.ConexionDB[0])) + ':') + (GlobalVariable.ConexionDB[1])) + 
    ':') + (GlobalVariable.ConexionDB[2]), GlobalVariable.ConexionDB[3], GlobalVariable.ConexionDB[4], GlobalVariable.ConexionDB[
    5])
*/
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.login[1])

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[1])

WebUI.selectOptionByValue(findTestObject('Intermediario/CrearOferta/TipoDocumentoSelect'), GlobalVariable.userIntermediario[
    0], true)

WebUI.setText(findTestObject('Intermediario/CrearOferta/NumerodocumentoInput'), GlobalVariable.userIntermediario[1])

WebUI.setText(findTestObject('Intermediario/CrearOferta/ContrasenaInput'), GlobalVariable.userIntermediario[2])

WebUI.click(findTestObject('Intermediario/CrearOferta/IniciarSesionButton'))

WebUI.scrollToPosition(0, 20)

WebUI.setText(findTestObject('Intermediario/CrearOferta/SolicitudInput'), GlobalVariable.Solicitud)

WebUI.click(findTestObject('Intermediario/CrearOferta/FiltrarButton'))

WebUI.click(findTestObject('Intermediario/CrearOferta/AccionDetalleButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Intermediario/CrearOferta/InformacionGeneralBeneficiarioLabel'))

WebUI.click(findTestObject('Intermediario/CrearOferta/DocumentosAsociadosSolicitudLAbel'))

WebUI.click(findTestObject('Intermediario/CrearOferta/HistorialSolicitudLabel'))

WebUI.click(findTestObject('Intermediario/CrearOferta/VolverButton'))

WebUI.scrollToPosition(0, 20)

WebUI.setText(findTestObject('Intermediario/CrearOferta/SolicitudInput'), GlobalVariable.Solicitud)

WebUI.click(findTestObject('Intermediario/CrearOferta/FiltrarButton'))

WebUI.click(findTestObject('Intermediario/CrearOferta/AccionAprobarButton'))

def select='Seleccione una opción'

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : 'Seleccióne una opcion']))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : 'Propios']))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : select]))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : 'Linea de Credito']))

WebUI.setText(findTestObject('Intermediario/CrearOferta/MontoInput'), '2,000.000')

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : select]))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : '1']))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : select]))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : '1.12']))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : select]))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : 'Mensual']))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : 'Seleccióne una opcion']))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : '1']))

WebUI.setText(findTestObject('Intermediario/CrearOferta/NombreCargoInput'), 'profesional')

WebUI.setText(findTestObject('Intermediario/CrearOferta/ValorInput'), '50.000')

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasButton', [('text') : select]))

WebUI.click(findTestObject('Intermediario/CrearOferta/ListasValueLi', [('text') : 'CARGO ÚNICO']))

WebUI.click(findTestObject('Intermediario/CrearOferta/AgregarCargosButton'))

WebUI.click(findTestObject('Intermediario/CrearOferta/SiguienteButton'))

WebUI.setText(findTestObject('Intermediario/CrearOferta/ObservacionesTextArea'), 'prueba de automatizacion')

WebUI.click(findTestObject('Intermediario/CrearOferta/AprobarButton'))

WebUI.click(findTestObject('Intermediario/CrearOferta/AceptarButton'))

WebUI.closeBrowser()

