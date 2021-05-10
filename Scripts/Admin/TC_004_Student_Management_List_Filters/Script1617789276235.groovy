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

'Go to Student Management screen'
WebUI.click(findTestObject('Menus/Admin_Menu_Student_management'))

'Enter student name in search criteria'
WebUI.setText(findTestObject('Admin/Branch_Management/Student_Management/Student_Name_input'), GlobalVariable.student_name)

'Verify search result'
WebUI.verifyElementText(findTestObject('Admin/Branch_Management/Student_Management/Filter_Result_First_Record'), GlobalVariable.student_fullname)

WebUI.delay(1)

'Select On Hold status'
WebUI.selectOptionByLabel(findTestObject('Admin/Branch_Management/Student_Management/Status_select'), 'On-Hold', false)

WebUI.delay(1)

'Verify search result does not show record'
WebUI.verifyElementNotPresent(findTestObject('Admin/Branch_Management/Student_Management/Filter_Result_First_Record'), 0)

WebUI.delay(1)

'Clear filters'
WebUI.click(findTestObject('Admin/Branch_Management/Student_Management/Clear_Filter_Label'))

'Verify clear filter resets the list'
WebUI.verifyElementPresent(findTestObject('Admin/Branch_Management/Student_Management/Filter_Result_First_Record'), 0)

WebUI.delay(1)

'Select Test Prep'
WebUI.selectOptionByLabel(findTestObject('Admin/Branch_Management/Student_Management/Select_Group_combo'), 'Test Prep', 
    false)

WebUI.delay(2)

'Select SAT Group Class'
WebUI.selectOptionByLabel(findTestObject('Admin/Branch_Management/Student_Management/Select_Program_combo'), 'SAT Group Class', 
    false)

'Select Weekend SAT'
WebUI.selectOptionByLabel(findTestObject('Admin/Branch_Management/Student_Management/Select_Sub_Program'), 'Weekend SAT', 
    false)

WebUI.delay(1)

'Enter student name in search criteria'
WebUI.setText(findTestObject('Admin/Branch_Management/Student_Management/Student_Name_input'), GlobalVariable.student_name)

WebUI.delay(1)

'Verify search result'
WebUI.verifyElementText(findTestObject('Admin/Branch_Management/Student_Management/Filter_Result_First_Record'), GlobalVariable.student_fullname)

WebUI.delay(1)

'Click on View Details of first record'
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
WebUI.click(findTestObject('Common_Objects/Common/Button_Close'))

WebUI.closeBrowser()

