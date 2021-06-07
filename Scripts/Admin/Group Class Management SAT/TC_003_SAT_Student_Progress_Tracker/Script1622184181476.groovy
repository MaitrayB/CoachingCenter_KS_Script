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

'Collapse branch management menu'
WebUI.click(findTestObject('Menus/Admin_Menu_Branch_Management'))

'Click on Group class management menu'
WebUI.click(findTestObject('Menus/Admin_Group_Class_Management'))

'Click on SAT menu'
WebUI.click(findTestObject('Menus/Admin_SAT'))

'Click on Manage Class menu'
WebUI.click(findTestObject('Menus/Admin_Manage_Class'))

'Click on Student Progress Tracker'
WebUI.click(findTestObject('Menus/Menu_SAT_Student_Progress_Tracker'))

'Select program as weekend SAT'
WebUI.selectOptionByLabel(findTestObject('Admin/Branch_Management/Student_Management/Select_Sub_Program_by_ng_attribute'), 
    'Weekend SAT', false)

'Select batch'
WebUI.selectOptionByIndex(findTestObject('Common_Objects/Common/Batch_Select'), 1)

'Click on View Progress button first record'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/View_Progress_First_Record_Button'))

String text = WebUI.getText(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Progress_Report_Header'))

if (!(text.contains('Progress Report'))) {
    KeywordUtil.markFailed('Progress Report not contain expected text.')
}

'Click on Reading Test Radio'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Reading_Test_Radio'))

WebUI.delay(1)

'Click on Writing Test Radio'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Writing_Test_Radio'))

WebUI.delay(1)

'Click on Full Length Test Radio'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Full_Length_Test_Radio'))

WebUI.delay(1)

'See vocabulory progress'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Vocabulory_Progress_Tab'))

WebUI.delay(1)

'See math practice history'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Math_Practise_History_Tab'))

WebUI.delay(1)

'See quiz history'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Quiz_History_Tab'))

WebUI.delay(1)

'Close button'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Student_Progress_Tracker/Button_Close_modal'))

WebUI.delay(1)

WebUI.closeBrowser()

