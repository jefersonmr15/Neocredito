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

WebUI.navigateToUrl('http://172.31.10.14:8080/ngneocredito/#/home')

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/IniciarSesionButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/AliadoFinancieroLink'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intermediario/AprobarOferta/TipoDocumentoInput'), GlobalVariable.userIntermediario[0], true)

WebUI.setText(findTestObject('Object Repository/Intermediario/AprobarOferta/NumerodocumentoInput'), GlobalVariable.userIntermediario[1])

WebUI.setText(findTestObject('Object Repository/Intermediario/AprobarOferta/ContrasenaInput'), GlobalVariable.userIntermediario[2])

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/IniciarSesionButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/AprobarOferta/SolicitudInput'), GlobalVariable.Solicitud)

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/FiltrarButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/DetalleOfertaAprobadorButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/VolverButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/AprobarOferta/SolicitudInput'), GlobalVariable.Solicitud)

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/FiltrarButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/AprobarPropuestaButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/AprobarOferta/ObservacionInput'), 'Prueba automatizada')

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/AprobarButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/AprobarOferta/AceptarButton'))

