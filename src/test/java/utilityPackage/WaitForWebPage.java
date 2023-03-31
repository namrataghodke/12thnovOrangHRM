package utilityPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitForWebPage {
	
WebDriver driver;	
	
public static void waitForPage(int timeout,WebDriver driver) {	
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	
}
	
	
	
}
