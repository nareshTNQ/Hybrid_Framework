/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author 9395
 *
 */
public class scrollIntoView {
	
	public static String scrollView(WebDriver driver, String locatorType, String locatorValue){
		
		JavascriptExecutor je = (JavascriptExecutor) driver;		
		if (locatorType.equalsIgnoreCase("xpath")) {
			WebElement element = driver.findElement(By.xpath(locatorValue));
			je.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		return "";
		
		
	}

}
