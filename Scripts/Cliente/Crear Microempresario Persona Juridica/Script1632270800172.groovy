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
import java.time.Duration as Duration
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.awt.event.KeyEvent as KeyEvent
import java.awt.Robot as Robot

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.home)

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[1])

WebUI.click(findTestObject('Cliente/RegistroPersonaNatural/RegistrateButton'))

WebUI.click(findTestObject('Cliente/RegistroPersonaJuridica/PersonaJuridicaLink'))

WebUI.setText(findTestObject('Cliente/RegistroPersonaJuridica/RazonsocialInput'), findTestData(DataFile).getValue(campo[
        0], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/NumeroDocumentoInput'), findTestData(DataFile).getValue(campo[
        1], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaJuridica/DVInput'), findTestData(DataFile).getValue(campo[2], fila))

WebUI.selectOptionByValue(findTestObject('Cliente/RegistroPersonaNatural/AnoVentasSelect'), findTestData(DataFile).getValue(
        campo[3], fila), true)

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/NivelVentasInput'), findTestData(DataFile).getValue(campo[4], 
        fila))

WebUI.selectOptionByValue(findTestObject('Cliente/RegistroPersonaNatural/ActividadEconomicaSelect'), findTestData(DataFile).getValue(
        campo[5], fila), true)

WebUI.selectOptionByValue(findTestObject('Cliente/RegistroPersonaJuridica/PersonaContactoSelect'), findTestData(DataFile).getValue(
        campo[6], fila), false)

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/PrimerNombreInput'), findTestData(DataFile).getValue(campo[
        7], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/SegundoNombreInput'), findTestData(DataFile).getValue(campo[
        8], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/PrimerApellidoInput'), findTestData(DataFile).getValue(campo[
        9], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/SegundoApellidoInput'), findTestData(DataFile).getValue(campo[
        10], fila))

WebUI.selectOptionByValue(findTestObject('Cliente/RegistroPersonaNatural/TipoDocumentoSelect'), findTestData(DataFile).getValue(
        campo[11], fila), false)

WebUI.setText(findTestObject('Cliente/RegistroPersonaJuridica/NumeroDocumentoInput'), findTestData(DataFile).getValue(campo[
        12], fila))

WebUI.selectOptionByValue(findTestObject('Cliente/RegistroPersonaNatural/GeneroSelect'), findTestData(DataFile).getValue(
        campo[13], fila), false)

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/NumeroCelularInput'), findTestData(DataFile).getValue(campo[
        14], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/CorreoElectronicoInput'), findTestData(DataFile).getValue(campo[
        15], fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/ContrasenaInput'), findTestData(DataFile).getValue(campo[16], 
        fila))

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/ConfirmarContrasenaInput'), findTestData(DataFile).getValue(
        campo[16], fila))

WebUI.scrollToElement(findTestObject('Cliente/RegistroPersonaNatural/ConfirmarContrasenaInput'), 0)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.sendKeys(findTestObject('Cliente/RegistroPersonaNatural/ConfirmarContrasenaInput'), Keys.chord(Keys.TAB))

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_DOWN)

WebUI.sendKeys(findTestObject('Cliente/RegistroPersonaNatural/ConfirmarContrasenaInput'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Cliente/RegistroPersonaNatural/DatosPersonalesRadio'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Cliente/RegistroPersonaNatural/FinalizarRegistroButton'))

WebUI.waitForElementVisible(findTestObject('Cliente/RegistroPersonaNatural/CodigoCorreoInput'), 0)

def currentWindow = WebUI.getWindowIndex()

robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_T)
robot.keyRelease(KeyEvent.VK_CONTROL)
robot.keyRelease(KeyEvent.VK_T)

//WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://yopmail.com/es/')

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/CorreoYopmailInput'), findTestData(DataFile).getValue(campo[
        15], fila))

WebUI.click(findTestObject('Cliente/RegistroPersonaNatural/CrearCorreoButton'))

//WebUI.click(findTestObject('Cliente/RegistroPersonaNatural/PrimerCorreoLabel'))
Code = WebUI.getAttribute(findTestObject('Cliente/RegistroPersonaNatural/CodigoCorreoLabel'), 'innerText')

WebUI.switchToWindowIndex(currentWindow)

WebUI.setText(findTestObject('Cliente/RegistroPersonaNatural/CodigoCorreoInput'), Code)

WebUI.click(findTestObject('Cliente/RegistroPersonaNatural/VerificarCodigoButton'))

WebUI.click(findTestObject('Cliente/RegistroPersonaNatural/PaginaPrincipalbutton'))

