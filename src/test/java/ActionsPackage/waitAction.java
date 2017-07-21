/**
 * 
 */
package ActionsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;



/**
 * @author 9395
 *
 */
public class waitAction {
	
		
	public static void wait(String data) throws InterruptedException{		
		
				
		int wait_number = Integer.parseInt(data);		
		
		Thread.sleep(wait_number);
		
	}


}
