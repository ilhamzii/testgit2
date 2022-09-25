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

data = findTestData('SelendroidData')

for (def index : (0..data.getRowNumbers() - 1)) {
    Mobile.startApplication('C:\\Users\\Ilhamzi\\Downloads\\selendroid-test-app-0.17.0.apk', false)

    Mobile.tap(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/form_btn'), 10)

    Mobile.delay(3)

    Mobile.hideKeyboard()

    Mobile.setText(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/username_txtfield'), data.internallyGetValue(
            'Username', index), 10)

    Mobile.setText(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/email_txtfield'), data.internallyGetValue(
            'Email', index), 10)

    Mobile.setText(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/password_txtfield'), data.internallyGetValue(
            'Password', index), 10)

    Mobile.clearText(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/name_txtfield'), 10)

    Mobile.setText(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/name_txtfield'), data.internallyGetValue(
            'Fullname', index), 10)

    expectedName = data.internallyGetValue('Fullname', index)

    Mobile.tap(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/ProgrammingLanguagelist'), 10)

    Mobile.checkElement(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/java_optionList'), 10)

    Mobile.checkElement(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/acceptAdds_checkbox'), 10)

    Mobile.verifyElementChecked(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/acceptAdds_checkbox'), 
        0)

    Mobile.tap(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/RegisterUserVerify_btn'), 10)

    Mobile.verifyElementVisible(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/name_text'), 10)

    actualName = Mobile.getText(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/name_text'), 10)

    Mobile.verifyEqual(actualName, expectedName)

    Mobile.tap(findTestObject('Object Repository/TC_06_RegistrationScriptingdatafiles/RegisterUser_btn'), 10)

    Mobile.closeApplication()
}



