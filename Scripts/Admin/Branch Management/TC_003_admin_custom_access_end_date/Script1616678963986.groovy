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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

LocalDate date1 = LocalDate.now().minusDays(1)

println(date1.format(java.time.format.DateTimeFormatter.ofPattern('dd-MM-yyyy')).toString())

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

'Click on Group Class Management Menu'
WebUI.click(findTestObject('Menus/Admin_Group_Class_Management'))

'Click on SAT menu'
WebUI.click(findTestObject('Menus/Admin_SAT'))

'Click on Manage Class menu'
WebUI.click(findTestObject('Menus/Admin_Manage_Class'))

'Click on Batch Details Viewer'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Batch_Details_Viewer'))

WebUI.delay(3)

'Select Weekend SAT from dropdown'
WebUI.selectOptionByLabel(findTestObject('Common_Objects/Common/Program_Dropdown'), 'Weekend SAT', false)

'Select batch'
WebUI.selectOptionByIndex(findTestObject('Common_Objects/Common/Batch_Dropdown'), 1)

'Change date to yesterday'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Edit_Date_First_Record'))

WebUI.setText(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Input_Date'), date1.format(java.time.format.DateTimeFormatter.ofPattern(
            'dd-MM-yyyy')).toString())

WebUI.delay(2)

'Save date'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Save_date'))

'View details pop up for first record'
WebUI.click(findTestObject('Common_Objects/Common/View_Details_Icon_firstRecord'))

'Login as student'
WebUI.click(findTestObject('Common_Objects/Common/Button_LoginAsStudent'))

'Click on Weekend SAT program'
WebUI.click(findTestObject('Common_Objects/Common/SAT_Program_Panel'))

'Verify that link is not clickable'
WebUI.verifyElementNotPresent(findTestObject('Common_Objects/Common/SAT_group_class_Weekend_SAT_link'), 3)

'Click on Student menu on top'
WebUI.click(findTestObject('Common_Objects/Common/Student_logged_in_menu'))

'Click on Previous Admin option'
WebUI.click(findTestObject('Common_Objects/Common/Previous_Admin_Menu'))

date1 = LocalDate.now().plusDays(1)

'Click on Group Class Management Menu'
WebUI.click(findTestObject('Menus/Admin_Group_Class_Management'))

'Click on SAT menu'
WebUI.click(findTestObject('Menus/Admin_SAT'))

'Click on Manage Class menu'
WebUI.click(findTestObject('Menus/Admin_Manage_Class'))

'Click on Batch Details Viewer'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Batch_Details_Viewer'))

WebUI.delay(3)

'Select Weekend SAT from dropdown'
WebUI.selectOptionByLabel(findTestObject('Common_Objects/Common/Program_Dropdown'), 'Weekend SAT', false)

'Select batch'
WebUI.selectOptionByIndex(findTestObject('Common_Objects/Common/Batch_Dropdown'), 1)

'Change date to Tomorrow'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Edit_Date_First_Record'))

WebUI.setText(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Input_Date'), date1.format(java.time.format.DateTimeFormatter.ofPattern(
            'dd-MM-yyyy')).toString())

WebUI.delay(2)

'Save date'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Batch_Details_Viewer/Save_date'))

WebUI.delay(2)

'View details pop up for first record'
WebUI.click(findTestObject('Common_Objects/Common/View_Details_Icon_firstRecord'))

'Login as student'
WebUI.click(findTestObject('Common_Objects/Common/Button_LoginAsStudent'))

'Click on Weekend SAT program'
WebUI.click(findTestObject('Common_Objects/Common/SAT_Program_Panel'))

'Verify that link is clickable'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/SAT_group_class_Weekend_SAT_link'), 3)

'Click on Link'
WebUI.click(findTestObject('Common_Objects/Common/SAT_group_class_Weekend_SAT_link'))

WebUI.delay(4)

WebUI.closeBrowser()

