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

'Open browser'
WebUI.openBrowser(GlobalVariable.URL)

'Maximize window'
WebUI.maximizeWindow()

'Enter username'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.Admin)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.admin_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Click on New Registrations menu'
WebUI.click(findTestObject('Admin/Branch_Management/New_Registrations/New_Registrations_menu'))

'Click on Conversations button'
WebUI.click(findTestObject('Admin/Branch_Management/New_Registrations/button_Coversation'))

'Input texts in text area'
WebUI.setText(findTestObject('Common_Objects/Common/textarea_conversation'), 'Rejecting this student')

'Submit conversation comments'
WebUI.click(findTestObject('Common_Objects/Common/button_Submit'))

'Verify comment texts are saved succesfully'
WebUI.verifyElementText(findTestObject('Admin/Branch_Management/New_Registrations/message_conversation_line1'), 'Rejecting this student - Keith')

'Close the modal by clicking on x'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'View details of first record'
WebUI.click(findTestObject('Common_Objects/Common/View_Details_Icon_firstRecord'))

WebUI.scrollToElement(findTestObject('Common_Objects/Common/Delete_button'), 0)

'Click on delete button'
WebUI.click(findTestObject('Common_Objects/Common/Delete_button'))

'Verify delete success message'
WebUI.verifyElementText(findTestObject('Common_Objects/Common/Delete_Success_Message'), 'Enrollment has been deleted successfully.')

WebUI.delay(2)

'Close the details modal'
WebUI.click(findTestObject('Admin/Branch_Management/New_Registrations/NR_Modal_Close'))

WebUI.delay(3)

'Close browser'
WebUI.closeBrowser()

