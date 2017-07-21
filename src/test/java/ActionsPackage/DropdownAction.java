/**
 * 
 */
package ActionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author 9395
 *
 */
public class DropdownAction {
	
	public static String dropDown (WebDriver driver, String locatorType, String locatorValue, String data){
		

		if (locatorType.equalsIgnoreCase("id")) {
			WebElement dropdown = driver.findElement(By.id(locatorValue));
			Select DD = new Select(dropdown);
			DD.selectByVisibleText(data);
		}

		if (locatorType.equalsIgnoreCase("xpath")) {
			WebElement dropdown = driver.findElement(By.xpath(locatorValue));
			Select DD = new Select(dropdown);
			DD.selectByVisibleText(data);
		}
		
		return "pass";
		
	}

}
