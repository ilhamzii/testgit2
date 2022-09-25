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

//'Tap OK'
//Mobile.tap(findTestObject('Object Repository/TC_01/OK_btn'), 0)
'Verify App'
Mobile.verifyElementExist(findTestObject('Object Repository/TC_01/app_btnnn'), 10)

Mobile.takeScreenshot('D:\\screenshot.png')

'Tap App'
Mobile.tap(findTestObject('Object Repository/TC_01/app_btnnn'), 10)

'Tap Activity'
Mobile.tap(findTestObject('Object Repository/TC_01/Activity_btn'), 10)

'Tap Custom Dialog'
Mobile.tap(findTestObject('Object Repository/TC_01/CustomDialog_btn'), 10)

Mobile.closeApplication()


