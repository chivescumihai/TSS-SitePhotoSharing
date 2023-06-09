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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

//Aici se obtine calea catre folderul proiectului
Path currentRelativePath = Paths.get('')

String projectDir = currentRelativePath.toAbsolutePath().toString()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:7044/')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Homepage - SitePhotoSharing/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Log in - SitePhotoSharing/input_Introduceti datele de login_Input.Email'), 
    'deo@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in - SitePhotoSharing/input_Email_Input.Password'), 'kQjUgC0g9zC2SvMrTWf+kA==')

WebUI.click(findTestObject('Object Repository/Page_Log in - SitePhotoSharing/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Homepage - SitePhotoSharing/a_Adaugare Poza'))

WebUI.uploadFile(findTestObject('Page_AdaugarePoza - SitePhotoSharing/input_Fisier Uploadat'), projectDir + '/pics/pupper.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AdaugarePoza - SitePhotoSharing/select_Selectati o categorie               _acce3b'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_AdaugarePoza - SitePhotoSharing/input_Descriere_Descriere'), 'Test automat')

WebUI.click(findTestObject('Object Repository/Page_AdaugarePoza - SitePhotoSharing/input_Categorie_btn btn-primary'))

WebUI.delay(5)

WebUI.closeBrowser()

