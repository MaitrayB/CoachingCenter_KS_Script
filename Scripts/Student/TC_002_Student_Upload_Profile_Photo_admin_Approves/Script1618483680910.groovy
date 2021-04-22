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
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.student_username)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.student_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Click Upload profile photo menu'
WebUI.click(findTestObject('Menus/Menu_Upload_Profile_Photo'))

'Upload file'
WebUI.uploadFile(findTestObject('Common_Objects/Common/Input_File_Upload'), GlobalVariable.Profile_photo_file_path)

'wait'
WebUI.delay(3)

'Click on Update Image button'
WebUI.click(findTestObject('Common_Objects/Common/Button_Update'))

'Logout as student'
WebUI.click(findTestObject('Common_Objects/Common/Logout_Link'))

'Enter admin email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.Admin)

'Enter admin password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.admin_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Go to photo approval menu'
WebUI.click(findTestObject('Menus/Admin_Menu_Student_Photo_Approval'))

'Click on Manage request button'
WebUI.click(findTestObject('Admin/Branch_Management/Student_Photo_Approval/Photo_Approval_Manage_Request_Button', [('student_fullname') : GlobalVariable.student_fullname]))

WebUI.delay(3)

'Verify that Reject button is present'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Reject_Button'), 0)

'Approve the request'
WebUI.click(findTestObject('Common_Objects/Common/Approve_Button'))

WebUI.delay(3)

'Verify request is not in pending state'
WebUI.verifyElementNotPresent(findTestObject('Admin/Branch_Management/Student_Photo_Approval/Photo_Approval_Manage_Request_Button'), 
    0)

'Logout as Admin'
WebUI.click(findTestObject('Common_Objects/Common/Logout_Link'))

'Enter email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.student_username)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.student_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Click Upload profile photo menu'
WebUI.click(findTestObject('Menus/Menu_Upload_Profile_Photo'))

'Verify "Profile Photo is Already Approved" message'
WebUI.verifyElementVisible(findTestObject('Common_Objects/General_Objects/Message_Profile_Photo_Is_Already_Approved'))

WebUI.delay(3)

WebUI.closeBrowser()

