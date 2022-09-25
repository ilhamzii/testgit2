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

Mobile.startApplication('C:\\Users\\Ilhamzi\\Downloads\\selendroid-test-app-0.17.0.apk', true)

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.EditText'), 'ilham1', 0)

Mobile.setText(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.EditText (1)'), 'ilham@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.EditText (2)'), 'P@', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.TextView - Ruby'), 0)

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.CheckedTextView - Java'), 0)

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.CheckBox - I accept adds'), 0)

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.Button - Register User (verify)'), 
    0)

Mobile.tap(findTestObject('Object Repository/TC_03_RegistrationSelendroid/android.widget.Button - Register User'), 0)

Mobile.closeApplication()

