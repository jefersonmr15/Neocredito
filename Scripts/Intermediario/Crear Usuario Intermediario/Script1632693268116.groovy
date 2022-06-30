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

WebUI.navigateToUrl(GlobalVariable.login[1])

WebUI.setViewPortSize(GlobalVariable.resolution[0], GlobalVariable.resolution[1])

WebUI.selectOptionByValue(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/TipoDocumentoSelect'), 
    GlobalVariable.userIntermediario[0], true)

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/NumeroDocumentoInput'), GlobalVariable.userIntermediario[
    1])

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/ContraseaInput'), GlobalVariable.userIntermediario[
    2])

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/IniciarSesionButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/MenuButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/MenuAdministracionButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/MenuCrearUsuarioButton'))

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/PrimerNombreInput'), findTestData(
        DataFile).getValue(campo[0], 1))

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/SegundoNombreInput'), findTestData(
        DataFile).getValue(campo[1], 1))

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/PrimerApellidoInput'), findTestData(
        DataFile).getValue(campo[2], 1))

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/SegundoApellido'), findTestData(
        DataFile).getValue(campo[3], 1))

WebUI.selectOptionByValue(findTestObject('Intermediario/CrearUsuarioIntermediario/TipoDocumentoFormularioSelect'), findTestData(
        DataFile).getValue(campo[4], 1), true)

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/NumeroIdentificacionInput'), findTestData(
        DataFile).getValue(campo[5], 1))

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/CargoInput'), findTestData(DataFile).getValue(
        campo[6], 1))

WebUI.setText(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/CorreoElectronicoInput'), findTestData(
        DataFile).getValue(campo[7], 1))

WebUI.setText(findTestObject('Intermediario/CrearUsuarioIntermediario/CelularInput'), findTestData(DataFile).getValue(campo[
        8], 1))

WebUI.setText(findTestObject('Intermediario/CrearUsuarioIntermediario/OficinaInput'), findTestData(DataFile).getValue(campo[
        9], 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/DepartamentoSelect'), 
    findTestData(DataFile).getValue(campo[10], 1), true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/Municipio'), findTestData(
        DataFile).getValue(campo[11], 1), true)

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/RolSelect'))

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/AsignarButton'))

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/CrearUsuarioButton'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Intermediario/CrearUsuarioIntermediario/AceptarButton'))

