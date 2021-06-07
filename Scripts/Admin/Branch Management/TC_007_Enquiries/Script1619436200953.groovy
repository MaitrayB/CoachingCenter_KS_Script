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

'Go to Enquiries menu'
WebUI.click(findTestObject('Menus/Menu_Enquiries'))

'Enter firstname of parent'
WebUI.setText(findTestObject('Enquiries/Input_Parent_Firstname'), 'automation')

'Enter parent lastname'
WebUI.setText(findTestObject('Enquiries/Input_Parent_Lastname'), 'test')

'Enter phone number'
WebUI.setText(findTestObject('Enquiries/Input_Parent_PhoneNumber'), '1111111111')

'Enter student name'
WebUI.setText(findTestObject('Enquiries/Input_Student_FirstName'), 'student')

'Enter student lastname'
WebUI.setText(findTestObject('Enquiries/Input_Student_LastName'), 'automation')

'Enter message'
WebUI.setText(findTestObject('Enquiries/Input_Message_Area'), 'automation message')

'select option'
WebUI.click(findTestObject('Enquiries/Select_Interested_Program_Option_three'))

'Enter email of parent'
WebUI.setText(findTestObject('Enquiries/Input_Parent_Email'), 'automation@test.com')

'Click on Add/Update button'
WebUI.click(findTestObject('Enquiries/Button_Submit'))

'Success message'
WebUI.verifyElementVisible(findTestObject('Common_Objects/Common/div_Success_by_Class'))

WebUI.delay(2)

'Click on panel'
WebUI.click(findTestObject('Enquiries/Panel_Search_Students'))

'Enter search name'
WebUI.setText(findTestObject('Enquiries/Input_Search_ParentFirstname'), 'automation')

'Click on Search enqiury button'
WebUI.click(findTestObject('Enquiries/Button_SearchEnquiry'))

WebUI.scrollToElement(findTestObject('Common_Objects/Common/Footer'), 0)

'Verify search result is returned'
WebUI.verifyElementPresent(findTestObject('Enquiries/TR_Enquiry_searchResult'), 0)

WebUI.delay(2)

'Click on calendar control'
WebUI.click(findTestObject('Enquiries/Cal_From_DateRange'))

WebUI.delay(2)

'select today'
WebUI.click(findTestObject('Enquiries/Cal_From_Date_Today'))

'Click on Search enqiury button'
WebUI.click(findTestObject('Enquiries/Button_SearchEnquiry'))

'Verify search result is returned'
WebUI.verifyElementPresent(findTestObject('Enquiries/TR_Enquiry_searchResult'), 0)

WebUI.closeBrowser()

