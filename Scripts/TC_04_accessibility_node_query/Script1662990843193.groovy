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

Mobile.startApplication('C:\\Users\\Ilhamzi\\Downloads\\ApiDemos-debug.apk', false)
Mobile.tap(findTestObject('Object Repository/TC_04_accessibility_node/android.widget.TextView - Accessibility'), 0)
Mobile.tap(findTestObject('Object Repository/TC_04_accessibility_node/android.widget.TextView - Accessibility Node Querying'), 0)
Mobile.tap(findTestObject('Object Repository/TC_04_accessibility_node/android.widget.TextView - AccessibilityAccessibility Node Querying'), 0)
Mobile.verifyElementExist(findTestObject('TC_04_accessibility_node/android.widget.TextView - 1. Enable QueryBack'), 0)
Mobile.checkElement(findTestObject('Object Repository/TC_04_accessibility_node/android.widget.CheckBox'), 0)
Mobile.verifyElementChecked(findTestObject('Object Repository/TC_04_accessibility_node/android.widget.CheckBox'), 0)
Mobile.tap(findTestObject('Object Repository/TC_04_accessibility_node/android.widget.ImageButton'), 0)
Mobile.tapAtPosition(106,171)
Mobile.closeApplication()