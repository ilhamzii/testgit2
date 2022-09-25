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

Mobile.startApplication('C:\\Users\\Ilhamzi\\Downloads\\ApiDemos-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/TC_02/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/TC_02/android.widget.TextView - Views'), 0)

Mobile.scrollToText('Search View', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TC_02/android.widget.TextView - Search View'), 0)

Mobile.tap(findTestObject('Object Repository/TC_02/android.widget.TextView - Filter'), 0)

Mobile.setText(findTestObject('Object Repository/TC_02/android.widget.EditText - Cheese hunt'), 'Brick', 0)

expectedText = Mobile.getText(findTestObject('TC_02/android.widget.EditText - brick'), 0)

actualText = Mobile.getText(findTestObject('TC_02/android.widget.TextView - Brick'), 0)

Mobile.verifyEqual(actualText, expectedText)

Mobile.closeApplication()

