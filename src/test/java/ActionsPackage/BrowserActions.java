/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.WebDriver;

/**
 * @author 9395
 *
 */
public class BrowserActions {

	public static String openApplication(WebDriver driver, String URL){
		
		try {
			driver.manage().window().maximize();
			driver.get(URL);
			return "Pass";
		} catch (Exception e) {
			return e.getMessage();
		}			

	
	
}
}