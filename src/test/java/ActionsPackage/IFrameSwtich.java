/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author 9395
 *
 */
public class IFrameSwtich {
	
	
	public static String intoFrame(WebDriver driver, String locatorType, String locatorValue){
		
		WebElement button=driver.findElement(By.xpath(locatorValue));  
		 
		driver.switchTo().frame(button);		
		
		return "pass";
			
	}
	
	public static String outFrame(WebDriver driver){
		
		 driver.switchTo().defaultContent();		 
		 
		 return "pass";
	}
	

}
