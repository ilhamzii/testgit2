import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.GetTextKeyword as GetTextKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText as GetText
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.filePath, false)

Mobile.tap(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/form_button'), GlobalVariable.timeOut)
Mobile.delay(3)
Mobile.hideKeyboard()
Mobile.setText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/username_textfield'), username, GlobalVariable.timeOut)
expectedText = Mobile.getText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/username_textfield'), GlobalVariable.timeOut)
Mobile.setText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/email_textfield'), email, GlobalVariable.timeOut)
Mobile.setText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/password_textfield'), password, GlobalVariable.timeOut)
Mobile.clearText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/name_textfield'), GlobalVariable.timeOut)
Mobile.setText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/name_textfield'), fullname, GlobalVariable.timeOut)
Mobile.tap(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/programminglang_dropdown'), GlobalVariable.timeOut)
Mobile.tap(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/selectjava_btn - Copy', [('text') : programmingLanguage]), GlobalVariable.timeOut)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/accept_button'), GlobalVariable.timeOut)
Mobile.tap(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/verify_button'), GlobalVariable.timeOut)
actualText = Mobile.getText(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/username_text'), GlobalVariable.timeOut)
Mobile.verifyEqual(actualText, expectedText)
Mobile.tap(findTestObject('Object Repository/TC_07_selendroidwithTestSuites/register_button'), GlobalVariable.timeOut)
Mobile.closeApplication()