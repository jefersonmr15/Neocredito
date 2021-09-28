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

WebUI.selectOptionByValue(findTestObject('Intermediario/Administracion de Montos/TipoDocumentoSelect'), GlobalVariable.userIntermediario[
    0], true)

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/NumeroDocumentoInput'), GlobalVariable.userIntermediario[
    1])

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/ContrasenaInput'), GlobalVariable.userIntermediario[
    2])

WebUI.click(findTestObject('Intermediario/Administracion de Montos/IniciarSesionButton'))

WebUI.click(findTestObject('Intermediario/Administracion de Montos/MenuButton'))

WebUI.click(findTestObject('Intermediario/Administracion de Montos/MenuAdministracionButton'))

WebUI.click(findTestObject('Intermediario/Administracion de Montos/MenuAdministrarMontosButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/Administracion de Montos/MontoInicialInput'), '20,000,000')

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/MontoFinalInput'), '3,000,0000')

WebUI.click(findTestObject('Intermediario/Administracion de Montos/AgregarRangoButton'))

WebUI.click(findTestObject('Intermediario/Administracion de Montos/EditarMontoButton'))

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/ModalMontoInicialInput'), '20,000,001')

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/ModalMontoFinalInput'), '30,000,001')

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/ModalJustificacionInput'), 'Prueba Automatizada')

WebUI.click(findTestObject('Intermediario/Administracion de Montos/ModalModificarRangoButton'))

WebUI.click(findTestObject('Intermediario/Administracion de Montos/EliminarMontoButton'))

WebUI.setText(findTestObject('Intermediario/Administracion de Montos/ModalJustificacionBorrarInput'), 'Prueba Automatizada')

WebUI.click(findTestObject('Intermediario/Administracion de Montos/ModalBorrarRangoButton'))

