/**
 * 
 */
package ActionsPackage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

/**
 * @author 9395
 *
 */
public class SwitchToTab {
	
	
	public static void nextTab(WebDriver driver , int TabNo){

		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		 driver.switchTo().window(tabs2.get(TabNo)).toString();
		
	}
	
	public static void closeTab(WebDriver driver){
		
		driver.close();
		
	}

}
