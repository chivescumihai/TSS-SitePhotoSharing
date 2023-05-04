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
import java.util.Random as Random
import java.security.SecureRandom as SecureRandom

def random = new SecureRandom()

def emailLength = 4 + random.nextInt().mod(10)

def domainLength = 4 + random.nextInt().mod(5)

def randomEmail = ((generateRandomString(10) + '@') + generateRandomString(10)) + '.com'

def randomPassword = generateRandomString(10)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:7044/')

WebUI.click(findTestObject('Object Repository/Page_Homepage - SitePhotoSharing/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Creati un cont nou_Input.FirstName'), 
    'Firstname')

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Firstname_Input.LastName'), 'Lastname')

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Lastname_Input.Email'), randomEmail)

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Email_Input.Password'), randomPassword)

WebUI.setText(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/input_Password_Input.ConfirmPassword'), 
    randomPassword)

WebUI.click(findTestObject('Object Repository/Page_Inregistrare - SitePhotoSharing/button_Register'))

boolean elementsPresent = WebUI.verifyElementPresent(findTestObject('Page_Inregistrare - SitePhotoSharing/ul_validation-error-summary'), 
    0, FailureHandling.OPTIONAL)

if (elementsPresent) {
    KeywordUtil.markFailed('Validarea datelor de inregistrare a esuat.')
}

WebUI.closeBrowser()

def generateRandomString(int length) {
    def chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.'

    def random = new SecureRandom()

    def sb = new StringBuilder(length)

    (1..length).each({ 
            sb.append(chars.charAt(random.nextInt(chars.length())))
        })

    return sb.toString()
}

