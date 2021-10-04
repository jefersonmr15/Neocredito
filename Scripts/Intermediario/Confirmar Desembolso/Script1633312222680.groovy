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

WebUI.navigateToUrl('http://172.31.10.14:8080/ngneocredito/#/intermediario/login')

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/TipoDocumentoSelect'), GlobalVariable.userIntermediario[
    0], true)

WebUI.setText(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/NumerodocumentoInput'), GlobalVariable.userIntermediario[1])

WebUI.setText(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/ContrasenaInput'), GlobalVariable.userIntermediario[2])

WebUI.click(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/IniciarSesionFormularioButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/SolicitudInput'), GlobalVariable.Solicitud)

WebUI.click(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/FiltrarButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/AprobarButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/ModalObservacionInput'), 'PruebaAutomatizada')

WebUI.click(findTestObject('Object Repository/Intermediario/Aprobar Desembolso/ConfirmarDesembolsoButton'))

WebUI.waitForPageLoad(0)

WebUI.delay(10)

