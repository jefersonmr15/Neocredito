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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.home)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Cliente/IniciarSesionBoton'))

WebUI.click(findTestObject('Cliente/TipoUsuarioImg', [('text') : Cliente]))

WebUI.selectOptionByValue(findTestObject('Cliente/TipoDocumentoSelect'), GlobalVariable.userCliente[0], true)

WebUI.setText(findTestObject('Cliente/NumeroInput'), GlobalVariable.userCliente[1])

WebUI.setText(findTestObject('Cliente/ContrasenaInput'), GlobalVariable.userCliente[2])

WebUI.click(findTestObject('Cliente/LoginBoton'))

WebUI.click(findTestObject('Cliente/CrearSolicitudBoton'))

WebUI.setText(findTestObject('Cliente/FechaDocumentoInput'), '01/01/2011')

WebUI.setText(findTestObject('Cliente/FechaNacimientoInput'), '01/01/1993')

WebUI.selectOptionByValue(findTestObject('Cliente/DepartamentoResidenciaSelect'), '25', true)

WebUI.selectOptionByValue(findTestObject('Cliente/CiudadResidenciaSelect'), '25899', true)

WebUI.setText(findTestObject('Cliente/BarrioResidenciaInput'), 'calle 123')

WebUI.selectOptionByValue(findTestObject('Cliente/EstadoCivilSelect'), '1', true)

WebUI.click(findTestObject('Cliente/SeguridadSocialRadio', [('index') : 1]))

WebUI.selectOptionByValue(findTestObject('Cliente/NivelestudioSelect'), '1', true)

WebUI.selectOptionByValue(findTestObject('Cliente/TipoViviendaSelect'), '1', true)

WebUI.selectOptionByValue(findTestObject('Cliente/AnoActivosSelect'), '2020', true)

WebUI.setText(findTestObject('Cliente/NivelactivosInput'), '2,000,000')

WebUI.setText(findTestObject('Cliente/MontoInput'), '5000000')

WebUI.setText(findTestObject('Cliente/PlazoInput'), '12')

WebUI.setText(findTestObject('Cliente/DestinoTextArea'), 'solicitud creada')

'Botón guardar'
WebUI.click(findTestObject('Cliente/AccionBoton', [('index') : 1]))

'Botón siguiente'
WebUI.click(findTestObject('Cliente/AccionBoton', [('index') : 2]))

'Botón Crear solicitud'
WebUI.click(findTestObject('Cliente/AccionBoton', [('index') : 2]))

GlobalVariable.Solicitud=WebUI.getAttribute(findTestObject('Cliente/NoSolicitudLabel'), 'innerText')

WebUI.click(findTestObject('Cliente/FinalizarBoton'))

