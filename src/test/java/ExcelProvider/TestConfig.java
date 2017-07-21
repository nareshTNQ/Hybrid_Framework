/**
 * 
 */
package ExcelProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ActionsPackage.AlertsHandle;
import ActionsPackage.BrowserActions;
import ActionsPackage.CalenderHandle;
import ActionsPackage.ClickActions;
import ActionsPackage.CloseInstance;
import ActionsPackage.DropdownAction;
import ActionsPackage.ExtentReport;
import ActionsPackage.IFrameSwtich;
import ActionsPackage.RadioButton_N_CheckboxActions;
import ActionsPackage.RefreshPage;
import ActionsPackage.Screenshot;
import ActionsPackage.SwitchToTab;
import ActionsPackage.TypeActions;
import ActionsPackage.scrollIntoView;
import ActionsPackage.waitAction;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import ActionsPackage.ExtentReport;
/**
 * @author 9395
 *
 */	
public class TestConfig {
	public static ExtentReports report1 = null;
	public static ExtentTest logger1;
	
	@BeforeTest
	public void init() {
		report1 = new ExtentReports("D:\\SeleniumWorkspace\\com.KF\\ExtentReport\\test.html", true);
	}
	
    WebDriver driver;
    XSSFWorkbook wb1;
    
	@Test
	public void startTest() throws IOException, InterruptedException{

		ExcelData excel = new ExcelData();
		wb1 = excel.wb;
		
		  for(int i=0; i<wb1.getNumberOfSheets();i++){
			  
				  
			int rowCo = excel.rowCount(i);			
					
	     	for(int j=0;j<=rowCo;j++){
	     		

	     	
	     	 String testCase = excel.getData(i, j, 0);	    		
             String description = excel.getData(i, j, 1);
             String object_type = excel.getData(i, j, 2);
             String actions = excel.getData(i, j, 3);
             String locatorType = excel.getData(i, j, 4);
             String locator_values = excel.getData(i, j, 5);
             String testdata = excel.getData(i, j, 6);
             
           
			if(testCase.contains("TestcaseStart")) {            	 
				logger1 = ExtentReport.eReportStart(testCase);
			}
			
             
			if(object_type.equalsIgnoreCase("Browser")){         	 
            	 
            	 
            	 if(testdata.equalsIgnoreCase("Firefox")){
            		 
            		 if(actions.equalsIgnoreCase("startBrowser")){
            			 
            			 FirefoxDriverManager.getInstance().setup();
            			 driver = new FirefoxDriver();
            		 }
            	 }
             }
			
             if(object_type.equalsIgnoreCase("Browser")){
            	 
            	 if(testdata.equalsIgnoreCase("Chrome")){
            		 
            		 if(actions.equalsIgnoreCase("startBrowser")){
            			 
 /*           				ChromeOptions options = new ChromeOptions();
            				options.addArguments("--start-maximized");

            				Map<String, Object> prefs = new HashMap<String, Object>();
            				prefs.put("credentials_enable_service", false);
            				prefs.put("profile.password_manager_enabled", false);
            				options.setExperimentalOption("prefs", prefs);

            				DesiredCapabilities cap = DesiredCapabilities.chrome();
            				cap.setCapability(ChromeOptions.CAPABILITY, options);*/	
            				ChromeDriverManager.getInstance().setup();            			 
             			    driver = new ChromeDriver();
             			    logger1.log(LogStatus.INFO, description);
            		 }
            		 
            	 }
             }
             
             if(object_type.equalsIgnoreCase("OpenApp")){
            	 
            	 if(actions.equalsIgnoreCase("navigate")){
            		 
            		 BrowserActions.openApplication(driver, testdata);
            		 
            		 logger1.log(LogStatus.INFO, description);
            	 }
            	 
             }
             
             
             if(object_type.equalsIgnoreCase("typeText")){
            	 
            	TypeActions.typeAction(driver, locatorType, locator_values, testdata);
            	logger1.log(LogStatus.INFO, description);
            	 
             }
             
             if(object_type.equalsIgnoreCase("click")){
            	 
            	 ClickActions.clickOnMe(driver, locatorType, locator_values);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("waitTime")){
            	 
            	 waitAction.wait(testdata);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("dropDown")){
            	 
            	 DropdownAction.dropDown(driver, locatorType, locator_values, testdata);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("selectDate")){
            	 
            	 CalenderHandle.datePicker(driver, locatorType, locator_values, testdata);
            	 logger1.log(LogStatus.INFO, description);
            	 
             }
             
             if(object_type.equalsIgnoreCase("checkRadio")){
            	 
            	 RadioButton_N_CheckboxActions.radioButtonCheckBox(driver, locatorType, locator_values);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("alertAccept")){
            	 
            	 AlertsHandle.alertsAccept(driver);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("alertDismiss")){
            	 
            	 AlertsHandle.alertsDismiss(driver);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("InFrame")){
            	 
            	 IFrameSwtich.intoFrame(driver, locatorType, locator_values);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("OutFrame")){
            	 
            	 IFrameSwtich.outFrame(driver);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("scrollIntoView")){
            	 
            	 scrollIntoView.scrollView(driver, locatorType, locator_values);
            	 logger1.log(LogStatus.INFO, description);
             }
				
             if(object_type.equals("refreshPage")){
            	 
            	 RefreshPage.refreshWebPage(driver);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("Screenshot")){
            	 
            	 Screenshot.screenShot(driver, description);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("SwitchTab")){
            	 Double value = Double.parseDouble(testdata);
            	 SwitchToTab.nextTab(driver, value.intValue());
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(object_type.equalsIgnoreCase("closeTab")){
            	 
            	 SwitchToTab.closeTab(driver);
            	 logger1.log(LogStatus.INFO, description);
             }
             
             if(testCase.contains("TestCaseEnd")) {
            	 
            	ExtentReport.eReportEnd(testCase); 
 				
 			}
             
             if(object_type.equalsIgnoreCase("quitWindow")){
            	 
            	 CloseInstance.quit(driver);
            	 
            	 logger1.log(LogStatus.INFO, description);
             }
             
              if(object_type.equalsIgnoreCase("closeWindow")){
            	 
            	 CloseInstance.close(driver);
            	 
            	 logger1.log(LogStatus.INFO, description);
            	 
             }
             

             
		}
	     	

	     	

	}

}
}