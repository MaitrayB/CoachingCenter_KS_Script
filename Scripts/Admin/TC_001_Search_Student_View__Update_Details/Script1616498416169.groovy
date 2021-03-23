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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Common_Objects/Login_Screen/input_Email'), GlobalVariable.Admin)

WebUI.setText(findTestObject('Common_Objects/Login_Screen/input_Password'), GlobalVariable.admin_password)

WebUI.click(findTestObject('Common_Objects/Login_Screen/button_Login'))

WebUI.click(findTestObject('Admin/Branch_Management/Search_Students/Search_Student_menu'))

WebUI.selectOptionByLabel(findTestObject('Admin/Branch_Management/Search_Students/select_Enrollment_Status'), 'Active', 
    false)

WebUI.click(findTestObject('Common_Objects/Common/Search_Button'))

WebUI.click(findTestObject('Admin/Branch_Management/Search_Students/View_Details_First_Record'))

WebUI.verifyElementVisible(findTestObject('Admin/Branch_Management/Student_Details_popup/Student_Details_header'))

WebUI.verifyElementVisible(findTestObject('Admin/Branch_Management/Student_Details_popup/Parent_Details_header'))

WebUI.verifyElementVisible(findTestObject('Admin/Branch_Management/Student_Details_popup/Enrollment_Timeslot_header'))

WebUI.verifyElementPresent(findTestObject('Admin/Branch_Management/Student_Details_popup/Update_Branch_header'), 0)

WebUI.click(findTestObject('Admin/Branch_Management/Student_Details_popup/Update_Branch_header'))

WebUI.click(findTestObject('Admin/Branch_Management/Student_Details_popup/Save_Branch_Button'))

WebUI.verifyElementVisible(findTestObject('Common_Objects/Common/Save_Success_Message'))

WebUI.click(findTestObject('Common_Objects/Common/Close_button'))

WebUI.closeBrowser()

