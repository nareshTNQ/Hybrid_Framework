/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExcelProvider.TestConfig;

/**
 * @author 9395
 *
 */
public class ExtentReport {

	public static ExtentReports report= TestConfig.report1;
	public static ExtentTest logger = TestConfig.logger1;
	
	public static ExtentTest eReportStart(String ExtTest){
		
		System.out.println("Inside the start");
		System.out.println("the object " + report.toString());
		logger=report.startTest(ExtTest);
		return logger;
		
	}
	public static void eReportEnd(String ExtTest){
		
		logger.log(LogStatus.PASS, ExtTest);	
        report.endTest(logger);
        report.flush();	
        }
	
}
