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

'Open browser and URL of site'
WebUI.openBrowser(GlobalVariable.URL)

'Maximize window'
WebUI.maximizeWindow()

'Enter email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.Admin)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.admin_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Click on Student Prospects'
WebUI.click(findTestObject('Menus/Admin_Menu_Student_Prospects'))

'Verify SAT Prospects header is present'
WebUI.verifyElementPresent(findTestObject('Admin/Branch_Management/Student_Prospects/SAT_Prospects_Header'), 0)

'Click on Conversations button'
WebUI.click(findTestObject('Admin/Branch_Management/New_Registrations/button_Coversation'))

'Input texts in text area'
WebUI.setText(findTestObject('Common_Objects/Common/textarea_conversation'), 'Prospect Automation Test')

'Submit conversation comments'
WebUI.click(findTestObject('Common_Objects/Common/button_Submit'))

'Verify comment texts are saved succesfully'
WebUI.verifyElementText(findTestObject('Admin/Branch_Management/New_Registrations/message_conversation_line1'), 'Prospect Automation Test - Keith')

'Close the modal by clicking on x'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'View details of first record'
WebUI.click(findTestObject('Common_Objects/Common/View_Details_Icon_firstRecord'))

'Verify that Student details header is present'
WebUI.verifyElementVisible(findTestObject('Admin/Branch_Management/Student_Details_popup/Student_Details_header'))

'Verify that Parent details header is present'
WebUI.verifyElementVisible(findTestObject('Admin/Branch_Management/Student_Details_popup/Parent_Details_header'))

'Verify that Enrollment Timeslot wish header is present'
WebUI.verifyElementVisible(findTestObject('Admin/Branch_Management/Student_Details_popup/Enrollment_Timeslot_header'))

'Verify that Update Branch Header header is present'
WebUI.verifyElementPresent(findTestObject('Admin/Branch_Management/Student_Details_popup/Update_Branch_header'), 0)

'Click on Update Branch Header'
WebUI.click(findTestObject('Admin/Branch_Management/Student_Details_popup/Update_Branch_header'))

'Click on Save Branch button'
WebUI.click(findTestObject('Admin/Branch_Management/Student_Details_popup/Save_Branch_Button'))

'Verify Success message'
WebUI.verifyElementVisible(findTestObject('Common_Objects/Common/Save_Success_Message'))

'Click on Close button.'
WebUI.click(findTestObject('Common_Objects/Common/Close_Button'))

'Verify SAT Prospects header is present'
WebUI.verifyElementPresent(findTestObject('Admin/Branch_Management/Student_Prospects/DukeTip_Prospect_Header'), 0)

WebUI.closeBrowser()

