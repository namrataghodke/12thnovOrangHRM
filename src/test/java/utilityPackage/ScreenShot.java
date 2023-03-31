package utilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
static WebDriver driver;
	
public static void captureScreenShot(WebDriver driver) throws IOException	{
	
	String path="test-output"+File.separator+"screenshot"+File.separator+System.currentTimeMillis()+".png";
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File(path);
	
	FileHandler.copy(source, destination);
	
	
	
	
	
	
}
	
	
	
	

}
