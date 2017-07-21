/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author 9395
 *
 */
public class AlertsHandle {
	
	
	public static String alertsAccept(WebDriver driver){
		
		driver.switchTo().alert().accept();		
		
		return "alertsAccept";
		}
	
public static String alertsDismiss(WebDriver driver){
		
		driver.switchTo().alert().dismiss();		
		
		return "alertsDismiss";
		}	
	
}
