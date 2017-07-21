/**
 * 
 */
package ActionsPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author 9395
 *
 */
public class CalenderHandle {
	
	public static String datePicker(WebDriver driver, String locatorType, String locatorValue, String data)
	{
		
		if(locatorType.equalsIgnoreCase("xpath")){
		
		List<WebElement> list = driver.findElements(By.xpath(locatorValue));
		
		for (WebElement totalList : list){
			
//			System.out.println("Total date " + totalList);
			
				String date=totalList.getText();
				
//				System.out.println("Total date " + date);
				
				Double d = new Double(data);
				int i = d.intValue();
			    String s =	Integer.toString(i);
			
			if(date.equalsIgnoreCase(s))
			{
				totalList.click();
				break;
			}
			
		}
		
		}		
		return "Pass";
		
		
		
	}

}
