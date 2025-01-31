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

WebUI.callTestCase(findTestCase('Blocks/Open Web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Navbar Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Login Page/h1_Login'))

WebUI.verifyElementVisible(findTestObject('Login Page/input_Email'))

WebUI.verifyElementVisible(findTestObject('Login Page/input_Password'))

WebUI.verifyElementVisible(findTestObject('Login Page/svg_Show Password'))

WebUI.click(findTestObject('Login Page/svg_Show Password'))

WebUI.verifyElementVisible(findTestObject('Login Page/svg_Hide Password'))

WebUI.click(findTestObject('Login Page/svg_Hide Password'))

WebUI.verifyElementVisible(findTestObject('Login Page/a_Forgot your password'))

WebUI.verifyElementVisible(findTestObject('Login Page/button_Login'))

WebUI.verifyElementVisible(findTestObject('Login Page/span_Remember me'))

WebUI.verifyElementVisible(findTestObject('Login Page/button_Log in with Google'))

WebUI.verifyElementVisible(findTestObject('Login Page/a_Not yet a customer'))

WebUI.closeBrowser()

