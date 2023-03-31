package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.ElementWait;

public class LoginPage {
	WebDriver driver;
	
	
	
@FindBy(xpath="//input[@placeholder='Username'][1]")
private WebElement userName;
	
@FindBy(xpath="//input[@name='password']")
private WebElement password;
	
@FindBy(xpath="//button[text()=' Login ']")	
private WebElement liginButton;
	
	
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
}
	
public void SendUN(String uname)
{
	userName.sendKeys(uname);
}

public void sendpass(String pass)
{
	password.sendKeys(pass);
}


public void clickonlogin()
{
	//ElementWait.waitForElement("//button[text()=' Login ']",20, driver);
	liginButton.click();
}


public boolean compareUrl()
{
 String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
 String CurrentUrl=driver.getCurrentUrl();
 boolean res=ExpectedUrl.equals(CurrentUrl);
 return res;
}


public boolean displayedLogin()
{
	boolean result=liginButton.isDisplayed();
	return result;
}

}
