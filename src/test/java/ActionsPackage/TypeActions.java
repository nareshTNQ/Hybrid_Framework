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
public class TypeActions {

	public static String typeAction(WebDriver driver, String locatorType, String locatorValue, String data){
		
		try {
			if(locatorType.equalsIgnoreCase("id")){
				
				driver.findElement(By.id(locatorValue)).sendKeys(data);
			}
			
			
			else if(locatorType.equalsIgnoreCase("name")){
				
				driver.findElement(By.name(locatorValue)).sendKeys(data);
			}
			
			
           else if (locatorType.equalsIgnoreCase("classname")){
				
				driver.findElement(By.className(locatorValue)).sendKeys(data);
			}


           else if(locatorType.equalsIgnoreCase("xpath")){
			
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
           }


           else if(locatorType.equalsIgnoreCase("css")){

        	   driver.findElement(By.cssSelector(locatorValue)).sendKeys(data);
           }


           else if(locatorType.equalsIgnoreCase("linkText")){

        	   driver.findElement(By.linkText(locatorValue)).sendKeys(data);
           }


           else if(locatorType.equalsIgnoreCase("partialLinkText")){

        	   driver.findElement(By.partialLinkText(locatorValue)).sendKeys(data);
        	   
        	    }
			
			return "pass";
		} catch (Exception e) {

			return e.getMessage();
		}

		
	}
		
	
}
