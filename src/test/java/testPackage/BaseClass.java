package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utilityPackage.ScreenShot;
import utilityPackage.StaticBrowser;
import utilityPackage.WaitForWebPage;

public class BaseClass {
	
	 static WebDriver driver;	
		
@Parameters({"browserName"})	

@BeforeTest

public void beforeTest(String browser)
{        
	this.driver=driver;
	 driver=StaticBrowser.openBrowser(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
          WaitForWebPage.waitForPage(10,driver);
       
}
	
	
@AfterTest
public void afterTest()
{
	//driver.quit();
}


@AfterMethod()
public void afterMethod(ITestResult result) throws IOException {
	
	if(result.getStatus()==ITestResult.FAILURE)
	{
	ScreenShot.captureScreenShot(driver);
	
	}
	
	
}










}
