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

'Click on Add/Remove branches menu'
WebUI.click(findTestObject('Menus/Admin_Menu_Add_Remove_Branches'))

'Click edit icon of first record of branch'
WebUI.click(findTestObject('Admin/Branch_Management/Add_Remove_Branch/Button_Edit_Branch_First_Record'))

'Set zip code to 10099'
WebUI.setText(findTestObject('Common_Objects/Common/Input_ZipCode'), '10099')

'Save branch details'
WebUI.click(findTestObject('Admin/Branch_Management/Add_Remove_Branch/Button_Save_Branch_Details'))

WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify zip code value'
WebUI.verifyElementText(findTestObject('Admin/Branch_Management/Add_Remove_Branch/Cell_Zipcode_First_Row'), '10099')

'Click edit icon of first record of branch'
WebUI.click(findTestObject('Admin/Branch_Management/Add_Remove_Branch/Button_Edit_Branch_First_Record'))

'Set zip code to 20965'
WebUI.setText(findTestObject('Common_Objects/Common/Input_ZipCode'), '20965')

'Save branch details'
WebUI.click(findTestObject('Admin/Branch_Management/Add_Remove_Branch/Button_Save_Branch_Details'))

WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify zip code value'
WebUI.verifyElementText(findTestObject('Admin/Branch_Management/Add_Remove_Branch/Cell_Zipcode_First_Row'), '20965')

WebUI.closeBrowser()

