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

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.setText(findTestObject('Object Repository/Page_Google/input_ng nhp_q'), 'tuoi')

WebUI.click(findTestObject('Object Repository/Page_Google/span_tuoitre'))

WebUI.navigateToUrl('https://www.google.com/search?q=tuoitre&source=hp&ei=Btq9YOLxDdCGr7wP0cSb2AI&iflsig=AINFCbYAAAAAYL3oFgBPXR4GlRkwJpfBsNyCSgaH_D7J&oq=tuoi&gs_lcp=Cgdnd3Mtd2l6EAEYADIICAAQsQMQgwEyAggAMggIABCxAxCDATICCAAyCAgAELEDEIMBMgIIADICCAAyAggAMgIIADICCAA6DggAELEDEIMBEMcBEKMCOggIABDHARCvAToCCC46CAguELEDEIMBOgQIABADOgQIABAKUOsrWN9IYOxYaABwAHgAgAF2iAGiA5IBAzIuMpgBAKABAaoBB2d3cy13aXo&sclient=gws-wiz')

WebUI.click(findTestObject('Object Repository/Page_tuoitre - Tm trn Google/a_Php lut'))

WebUI.click(findTestObject('Object Repository/Page_Tin tc, video mi, nng, nhanh trong 24h_931b3e/a_Kinh doanh'))

WebUI.closeBrowser()

