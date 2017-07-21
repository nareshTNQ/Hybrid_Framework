/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.WebDriver;

/**
 * @author 9395
 *
 */
public class RefreshPage {
	
	
	public static String refreshWebPage(WebDriver driver){
		
		driver.navigate().refresh();
		
		return "";			
		
	}

}
