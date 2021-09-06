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

WebUI.navigateToUrl('http://172.31.10.14:8080/ngneocredito/#/bancoldex/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Bancoldex/UsuarioInput'))

WebUI.setText(findTestObject('Bancoldex/UsuarioInput'), 'PEP0000')

WebUI.setEncryptedText(findTestObject('Bancoldex/ContrasenaInput'), 'V436J3owAFBKbNotFHTI5g==')

WebUI.click(findTestObject('Bancoldex/Loginboton'))

WebUI.scrollToElement(findTestObject('Bancoldex/NoSolicitudLabel', [('text') : GlobalVariable.Solicitud]), 0)

WebUI.click(findTestObject('Bancoldex/AprobarSolicitudBoton', [('text') : GlobalVariable.Solicitud]))

WebUI.click(findTestObject('Bancoldex/AprobarBoton'))

WebUI.closeBrowser()

