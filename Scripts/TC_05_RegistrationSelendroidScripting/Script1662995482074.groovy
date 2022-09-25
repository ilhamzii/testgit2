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

Mobile.startApplication('C:\\Users\\Ilhamzi\\Downloads\\selendroid-test-app-0.17.0.apk', false)
Mobile.tap(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/form_btn'), 0)
Mobile.setText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/username_txtfield'), 'usernamenih', 0)
Mobile.setText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/email_txtfield'), 'emailnih', 0)
Mobile.setText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/password_txtfield'), 'passwordnih', 0)
Mobile.hideKeyboard()
Mobile.clearText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/name_txtfield'), 0)
Mobile.setText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/name_txtfield'), 'namanih', 5)
expectedName = Mobile.getText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/name_txtfield'), 0)
Mobile.tap(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/ProgrammingLanguagelist'), 0)
Mobile.checkElement(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/java_optionList'), 0)
Mobile.checkElement(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/acceptAdds_checkbox'), 0)
Mobile.verifyElementChecked(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/acceptAdds_checkbox'), 0)
Mobile.tap(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/RegisterUserVerify_btn'), 0)
actualName = Mobile.getText(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/name_text'), 0)
Mobile.verifyEqual(actualName, expectedName)
Mobile.tap(findTestObject('Object Repository/TC_05_RegistrationScriptingSelendroid/RegisterUser_btn'), 0)
Mobile.closeApplication()
