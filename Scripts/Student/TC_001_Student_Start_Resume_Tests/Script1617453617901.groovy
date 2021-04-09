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
WebUI.setText(findTestObject('Common_Objects/Login_Screen/input_Email'), GlobalVariable.student_username)

'Enter password'
WebUI.setText(findTestObject('Common_Objects/Login_Screen/input_Password'), GlobalVariable.student_password)

'Click on login button'
WebUI.click(findTestObject('Common_Objects/Login_Screen/button_Login'))

'Click on SAT program panel'
WebUI.click(findTestObject('Common_Objects/Common/SAT_Program_Panel'))

'SAT Weekend link'
WebUI.click(findTestObject('Common_Objects/Common/SAT_group_class_Weekend_SAT_link'))

'Click SAT Math Quiz menu'
WebUI.click(findTestObject('Menus/Menu_SAT_Math_Quiz'))

WebUI.delay(3)

//document.evaluate("//tr[contains(.,"Algebra Quiz")]//td[contains(.,"Start a new quiz")]",document.body,null,9,null).singleNodeValue.click()', [])
'Start new quiz - Algebra quiz'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Algebra_Quiz_Start_New_Quiz'))

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

WebUI.delay(2)

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Click on Resume link'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Algebra_Quiz_Resume_quiz'))

for (def index : (0..3)) {
    'Click on Next button'
    WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

    'wait for 2 sec'
    WebUI.delay(2)
}

WebUI.click(findTestObject('Student/SAT_Math_Quiz/View_Results'))

'Verify success message is present'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Save_Success_Message'), 0)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify Resume link is no more available'
WebUI.verifyElementNotPresent(findTestObject('Student/SAT_Math_Quiz/Algebra_Quiz_Resume_quiz'), 0)

'Go to Quiz History'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_History_Tab'))

'Verify quiz history shows record for appeared quiz'
WebUI.verifyElementText(findTestObject('Student/SAT_Math_Quiz/Quiz_History_Row1_Quizname'), 'Algebra')

'Click SAT Math Quiz menu'
WebUI.click(findTestObject('Menus/Menu_SAT_Math_Quiz'))

'Start new quiz - Geometry quiz'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Geometry_Quiz_Start_New_Quiz'))

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

WebUI.delay(2)

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Click on Resume link'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Geometry_Quiz_Resume_quiz'))

for (def index : (0..9)) {
    'Click on Next button'
    WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

    'wait for 2 sec'
    WebUI.delay(2)
}

WebUI.click(findTestObject('Student/SAT_Math_Quiz/View_Results'))

'Verify success message is present'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Save_Success_Message'), 0)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify Resume link is no more available'
WebUI.verifyElementNotPresent(findTestObject('Student/SAT_Math_Quiz/Geometry_Quiz_Resume_quiz'), 0)

'Go to Quiz History'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_History_Tab'))

'Verify quiz history shows record for appeared quiz'
WebUI.verifyElementText(findTestObject('Student/SAT_Math_Quiz/Quiz_History_Row1_Quizname'), 'Geometry')

'Click SAT Math Quiz menu'
WebUI.click(findTestObject('Menus/Menu_SAT_Math_Quiz'))

'Start new quiz - Probability quiz'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Probability_Quiz_Start_New_Quiz'))

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

WebUI.delay(2)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Click on Resume link'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Probability_Quiz_Resume_quiz'))

for (def index : (0..1)) {
    'Click on Next button'
    WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

    'wait for 2 sec'
    WebUI.delay(2)
}

WebUI.click(findTestObject('Student/SAT_Math_Quiz/View_Results'))

'Verify success message is present'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Save_Success_Message'), 0)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify Resume link is no more available'
WebUI.verifyElementNotPresent(findTestObject('Student/SAT_Math_Quiz/Probability_Quiz_Resume_quiz'), 0)

'Go to Quiz History'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_History_Tab'))

'Verify quiz history shows record for appeared quiz'
WebUI.verifyElementText(findTestObject('Student/SAT_Math_Quiz/Quiz_History_Row1_Quizname'), 'Data, Statistics, and Probability')

'Click SAT Math Quiz menu'
WebUI.click(findTestObject('Menus/Menu_SAT_Math_Quiz'))

'Start new quiz - Trigonometry quiz'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Trigonometry_Quiz_Start_New_quiz'))

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

WebUI.delay(2)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Click on Resume link'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Trigonomerty_Quiz_Resume_quiz'))

for (def index : (0..1)) {
    'Click on Next button'
    WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

    'wait for 2 sec'
    WebUI.delay(2)
}

WebUI.click(findTestObject('Student/SAT_Math_Quiz/View_Results'))

'Verify success message is present'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Save_Success_Message'), 0)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify Resume link is no more available'
WebUI.verifyElementNotPresent(findTestObject('Student/SAT_Math_Quiz/Trigonomerty_Quiz_Resume_quiz'), 0)

'Go to Quiz History'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_History_Tab'))

'Verify quiz history shows record for appeared quiz'
WebUI.verifyElementText(findTestObject('Student/SAT_Math_Quiz/Quiz_History_Row1_Quizname'), 'Trigonometry')

'Click SAT Math Quiz menu'
WebUI.click(findTestObject('Menus/Menu_SAT_Math_Quiz'))

'Start new quiz - Complex Numbers quiz'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Complex_Numbers_Quiz_Start_New_quiz'))

'Click on Next button'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

WebUI.delay(2)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Click on Resume link'
WebUI.click(findTestObject('Student/SAT_Math_Quiz/Complex_Numbers_Resume_quiz'))

for (def index : (0..0)) {
    'Click on Next button'
    WebUI.click(findTestObject('Common_Objects/Common/Quiz_Next_button'))

    'wait for 2 sec'
    WebUI.delay(2)
}

WebUI.click(findTestObject('Student/SAT_Math_Quiz/View_Results'))

'Verify success message is present'
WebUI.verifyElementPresent(findTestObject('Common_Objects/Common/Save_Success_Message'), 0)

'Click on X'
WebUI.click(findTestObject('Common_Objects/Common/x_button'))

'Verify Resume link is no more available'
WebUI.verifyElementNotPresent(findTestObject('Student/SAT_Math_Quiz/Complex_Numbers_Resume_quiz'), 0)

'Go to Quiz History'
WebUI.click(findTestObject('Common_Objects/Common/Quiz_History_Tab'))

'Verify quiz history shows record for appeared quiz'
WebUI.verifyElementText(findTestObject('Student/SAT_Math_Quiz/Quiz_History_Row1_Quizname'), 'Complex Numbers')

'Click SAT Math Quiz menu'
WebUI.click(findTestObject('Menus/Menu_SAT_Math_Quiz'))

'Close browser'
WebUI.closeBrowser()

