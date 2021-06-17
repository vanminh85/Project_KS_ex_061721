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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/search?q=tuoitre&rlz=1C1GCEU_enVN943VN943&oq=tuoitre&aqs=chrome..69i57.6774j0j4&sourceid=chrome&ie=UTF-8')

WebUI.click(findTestObject('Object Repository/Page_tuoitre - Tm trn Google/h3_Tin tc, tin nng, c bo in t - Tui Tr Online'))

WebUI.click(findTestObject('Object Repository/Page_Tin tc, tin nng, oc bao in t - Tui Tre Online/a_Php lut'))

WebUI.click(findTestObject('Object Repository/Page_Tin tc, video mi, nng, nhanh trong 24h_931b3e/a_Th gii'))

WebUI.click(findTestObject('Object Repository/Page_Tin tc, video mi, nng, nhanh trong 24h_a20579/a_Thi s'))

WebUI.closeBrowser()

