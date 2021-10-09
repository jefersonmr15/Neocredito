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

WS.sendRequest(findTestObject('Cliente/Seleccionar Oferta/FinalizarPropuestaService', [('solicitud') : GlobalVariable.Solicitud]))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.31.10.14:8080/ngneocredito/#/home')

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[1])

WebUI.click(findTestObject('Object Repository/Cliente/Seleccionar Oferta/IniciarSesionbutton'))

WebUI.click(findTestObject('Cliente/Seleccionar Oferta/IniciarSesionLink'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cliente/Seleccionar Oferta/TipoDocumentoSelect'), GlobalVariable.userCliente[
    0], true)

WebUI.setText(findTestObject('Object Repository/Cliente/Seleccionar Oferta/NumerodocumentoInput'), GlobalVariable.userCliente[
    1])

WebUI.setText(findTestObject('Object Repository/Cliente/Seleccionar Oferta/Contrasena'), GlobalVariable.userCliente[2])

WebUI.click(findTestObject('Object Repository/Cliente/Seleccionar Oferta/LoginButton'))

WebUI.scrollToElement(findTestObject('Cliente/Seleccionar Oferta/SolicitudLabel', [('text') : GlobalVariable.Solicitud]), 
    0)

WebUI.click(findTestObject('Cliente/Seleccionar Oferta/OfertasButton', [('text') : GlobalVariable.Solicitud]))

WebUI.click(findTestObject('Object Repository/Cliente/Seleccionar Oferta/OfertaRadio'))

WebUI.click(findTestObject('Object Repository/Cliente/Seleccionar Oferta/SeleccionarOfertaButton'))

WebUI.waitForPageLoad(0)

WebUI.delay(5)

