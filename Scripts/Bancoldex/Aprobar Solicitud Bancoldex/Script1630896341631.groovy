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

WebUI.navigateToUrl(GlobalVariable.login[0])

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[0])

WebUI.click(findTestObject('Bancoldex/Aprobar Solicitud/UsuarioInput'))

WebUI.setText(findTestObject('Bancoldex/Aprobar Solicitud/UsuarioInput'), GlobalVariable.userBancoldex[0])

WebUI.setText(findTestObject('Bancoldex/Aprobar Solicitud/ContrasenaInput'), GlobalVariable.userBancoldex[1])

WebUI.click(findTestObject('Bancoldex/Aprobar Solicitud/LoginBoton'))

WebUI.setText(findTestObject('Bancoldex/Aprobar Solicitud/NoSolicitudInput'), GlobalVariable.Solicitud)

WebUI.click(findTestObject('Bancoldex/Aprobar Solicitud/FiltrarBoton'))

WebUI.click(findTestObject('Bancoldex/Aprobar Solicitud/AprobarSolicitudBoton', [('text') : GlobalVariable.Solicitud]))

WebUI.click(findTestObject('Bancoldex/Aprobar Solicitud/AprobarBoton'))

WebUI.waitForPageLoad(0)

WebUI.delay(10)

WebUI.closeBrowser()

