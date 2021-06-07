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

'Click deactivate button for batch'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Batches/Batch_Deactivate_Button', [('Batch_Name') : GlobalVariable.Batch_Name]))

'Verify success message'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/div_Success_by_Class'), 0)

'Verify batch is no more present as active'
WebUI.verifyElementNotPresent(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Batches/Batch_Deactivate_Button', [('Batch_Name') : GlobalVariable.Batch_Name]), 
    0)

'Click on Inactive label'
WebUI.click(findTestObject('Common_Objects/Common/InActive_Label'))

'Activate batch'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Batches/Batch_Activate_Button', [('Batch_Name') : GlobalVariable.Batch_Name]))

'Verify success message'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/div_Success_by_Class'), 0)

'Verify batch is no more present as inactive'
WebUI.verifyElementNotPresent(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Batches/Batch_Activate_Button'), 0)

'Go to active batch listing'
WebUI.click(findTestObject('Common_Objects/Common/Active_Label'))

'Edit batch button click'
WebUI.click(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Batches/Batch_Edit_Button', [('Batch_Name') : GlobalVariable.Batch_Name]))

'Enter webxID'
WebUI.setText(findTestObject('Admin/Group_Class_Management/Manage_Class/Manage_Batches/Webx_Input'), 'web123')

'Save changes '
WebUI.click(findTestObject('Common_Objects/Common/Save_changes_Button'))

'Verify success message'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Update_Success_msg'), 0)

'Close'
WebUI.click(findTestObject('Common_Objects/Common/Close_Button'))

WebUI.delay(2)

WebUI.closeBrowser()

