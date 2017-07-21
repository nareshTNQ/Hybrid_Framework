/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.WebDriver;

/**
 * @author 9395
 *
 */
public class CloseInstance {
	
	public static void quit(WebDriver driver){
		
		driver.quit();
	
	}
	
	public static void close(WebDriver driver){
		
		driver.close();
	}
}
