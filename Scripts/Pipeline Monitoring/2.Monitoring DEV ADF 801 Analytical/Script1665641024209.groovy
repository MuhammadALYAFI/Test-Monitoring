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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://adf.azure.com/en/monitoring/pipelineruns?factory=%2Fsubscriptions%2F6cb2ef62-2476-47e6-92ad-728710c0c19e%2FresourceGroups%2FDAN-AP-T-RSG800-Spoke-IDN-Analytical%2Fproviders%2FMicrosoft.DataFactory%2Ffactories%2FDAN-AP-T-ADF801-Spoke-IDN-Analytical')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'muhammad.alyafi@external.danone.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_DAN-AP-T-ADF801-Spoke-IDN-Ingestion - _693daf/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_DAN-AP-T-ADF801-Spoke-IDN-Ingestion - _693daf/div_Export to CSV_madrid-icon icon-chevron-_06f5d6'))

WebUI.click(findTestObject('Object Repository/Page_DAN-AP-T-ADF801-Spoke-IDN-Ingestion - _693daf/span_Export top 1000'))

