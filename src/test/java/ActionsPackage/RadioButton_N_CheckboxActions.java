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
public class RadioButton_N_CheckboxActions {
	
	
	public static String radioButtonCheckBox(WebDriver driver, String locatorType, String locatorValue){
		
		
		if (locatorType.equalsIgnoreCase("xpath")) {
			WebElement radioCheck = driver.findElement(By.xpath(locatorValue));
			radioCheck.click();
		}
		return null;
		}
	
	

}
