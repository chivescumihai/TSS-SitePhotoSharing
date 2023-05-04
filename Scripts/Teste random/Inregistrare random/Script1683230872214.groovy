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
import org.apache.commons.lang.RandomStringUtils as RandStr
import org.apache.commons.lang.RandomStringUtils as RandStr

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:7044/')

WebUI.click(findTestObject('Object Repository/Page_Homepage - SitePhotoSharing/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Creati un cont nou_Input.FirstName'), 
    'Numescu')

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Firstname_Input.LastName'), 'Prenumeanu')

String mailName = RandStr.randomAlphabetic(4)

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Lastname_Input.Email'), mailName+'@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Email_Input.Password'), 
    'S9nSJzsI1PKTZXmgCwavJw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Password_Input.ConfirmPassword'), 
    'S9nSJzsI1PKTZXmgCwavJw==')

WebUI.click(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/button_Register'))

