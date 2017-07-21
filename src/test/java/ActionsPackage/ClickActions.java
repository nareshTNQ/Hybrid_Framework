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
public class ClickActions {
	

		public static String clickOnMe(WebDriver driver, String locatorType, String locatorValue ){
			
						
			try {
				if(locatorType.equalsIgnoreCase("id")){
					
					driver.findElement(By.id(locatorValue)).click();
				}
				
				
				else if(locatorType.equalsIgnoreCase("name")){
					
					driver.findElement(By.name(locatorValue)).click();
				}
				
				
	           else if (locatorType.equalsIgnoreCase("classname")){
					
					driver.findElement(By.className(locatorValue)).click();
				}


	           else if(locatorType.equalsIgnoreCase("xpath")){
				
				driver.findElement(By.xpath(locatorValue)).click();
	           }


	           else if(locatorType.equalsIgnoreCase("css")){

	        	   driver.findElement(By.cssSelector(locatorValue)).click();
	           }


	           else if(locatorType.equalsIgnoreCase("linkText")){

	        	   driver.findElement(By.linkText(locatorValue)).click();
	           }


	           else if(locatorType.equalsIgnoreCase("partialLinkText")){

	        	   driver.findElement(By.partialLinkText(locatorValue)).click();
	        	   
	        	    }		
				
				
				
				
				return "pass";
			} catch (Exception e) {

				return e.getMessage();
			}

			
		}
	
	
}
