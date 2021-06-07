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

def todaydate1 = new Date().format('ddMMyyyy')

println("now = $todaydate1")

'Enter email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.Admin)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.admin_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Collapse branch management menu'
WebUI.click(findTestObject('Menus/Admin_Menu_Branch_Management'))

'Click on Group class management menu'
WebUI.click(findTestObject('Menus/Admin_Group_Class_Management'))

'Click on SAT menu'
WebUI.click(findTestObject('Menus/Admin_SAT'))

'Click on Manage Class menu'
WebUI.click(findTestObject('Menus/Admin_Manage_Class'))

WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/Manage_Class_Videos_tab'))

'Select Weekend SAT'
WebUI.selectOptionByLabel(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/Program_Select'), 
    'Weekend SAT', false)

'Select Batch'
WebUI.selectOptionByIndex(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/Batch_Select'), 
    1)

'Set date'
WebUI.setText(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/classDate_input'), "$todaydate1")

'Select Phase'
WebUI.selectOptionByIndex(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/Phase_Select'), 
    2)

'Enter URL'
WebUI.setText(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/video_URL_input'), 'http://www.google.com')

'Enter password'
WebUI.setText(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/Video_Password_Input'), 'test')

'Click on Add video button'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Videos/add_video_Button'))

WebUI.delay(4)

'Logout'
WebUI.click(findTestObject('Common_Objects/Common/Logout_Link'))

'Enter email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.student_username)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.student_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Click on SAT program panel'
WebUI.click(findTestObject('Common_Objects/Common/SAT_Program_Panel'))

'SAT Weekend link'
WebUI.click(findTestObject('Common_Objects/Common/SAT_group_class_Weekend_SAT_link'))

'Click class videos menu'
WebUI.click(findTestObject('Menus/Student_Menu_Class_Videos'))

'Click on watch video link'
WebUI.click(findTestObject('Student/Class Videos/Watch_Video_Link'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowTitle('Ramana Coaching Center')

'Click on watch video link'
WebUI.click(findTestObject('Student/Class Videos/Watch_Video_Link'))

'Verify - Video not available message'
WebUI.verifyElementVisible(findTestObject('Student/Class Videos/Video_not_available_label'))

'Click on Request Again link'
WebUI.click(findTestObject('Student/Class Videos/Request_Again_Link'))

'enter request message'
WebUI.setText(findTestObject('Student/Class Videos/Request_Message_input'), 'please enable the link again.')

'Click on request video button'
WebUI.click(findTestObject('Student/Class Videos/Request_Video_Button'))

WebUI.delay(2)

'Logout as student'
WebUI.click(findTestObject('Common_Objects/Common/Logout_Link'))

'Enter email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.Admin)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.admin_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Collapse branch management menu'
WebUI.click(findTestObject('Menus/Admin_Menu_Branch_Management'))

'Click on Group class management menu'
WebUI.click(findTestObject('Menus/Admin_Group_Class_Management'))

'Click on SAT menu'
WebUI.click(findTestObject('Menus/Admin_SAT'))

'Click on Manage Class menu'
WebUI.click(findTestObject('Menus/Admin_Manage_Class'))

'Click on manage class video requests tab'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Video_Requests/Manage_Video_Request_Tab'))

'Approve the request'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Class_Video_Requests/Approve_Request_Button'))

'Logout'
WebUI.click(findTestObject('Common_Objects/Common/Logout_Link'))

'Enter email address'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Email'), GlobalVariable.student_username)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/General_Objects/input_Password'), GlobalVariable.student_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/General_Objects/button_Login'))

'Click on SAT program panel'
WebUI.click(findTestObject('Common_Objects/Common/SAT_Program_Panel'))

'SAT Weekend link'
WebUI.click(findTestObject('Common_Objects/Common/SAT_group_class_Weekend_SAT_link'))

'Click class videos menu'
WebUI.click(findTestObject('Menus/Student_Menu_Class_Videos'))

'Verify watch video link'
WebUI.verifyElementPresent(findTestObject('Student/Class Videos/Watch_Video_Link'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

