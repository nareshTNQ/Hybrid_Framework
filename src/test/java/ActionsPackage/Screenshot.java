/**
 * 
 */
package ActionsPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * @author 9395
 *
 */
public class Screenshot {
	
	
	     public static String screenShot (WebDriver driver, String Description) throws IOException{
		
		 try {
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			 FileUtils.copyFile(source, new File("./Screenshots_viewer/"+ Description + ".png"));
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}		
		
	     return "";
		
		
	}

}
