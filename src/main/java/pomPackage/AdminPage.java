package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;

public class AdminPage {

    WebDriver driver;
	WebDriverWait wait;
	
	
@FindBy(xpath="//span[text()='User Management ']")
private WebElement UserMangement;
	

@FindBy(xpath="//a[text()='Users']")
private WebElement clickUm;

@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active']")
private WebElement userName;

@FindBy(xpath="//div[@class='oxd-select-text-input'][1]//preceding::div[@class='oxd-select-text oxd-select-text--active']")
private WebElement usclick;


@FindBy(xpath="//div[@role='listbox']//div[2]")
private WebElement adminSelect;

@FindBy(xpath="//input[@placeholder='Type for hints...']")
private WebElement employeeName;



@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']//following::div[text()='-- Select --']")
private WebElement status;




@FindBy(xpath="//div[@role='listbox']//div[2]")
private WebElement selectStatus;

@FindBy(xpath="//button[text()=' Search ']")
private WebElement searchButton;



	public AdminPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	}
	
	

	
	public void UseManClick() {
		
		UserMangement.click();
		
		ElementWait.waitForElement("//span[text()='User Management ']",20, driver);
			
	}
	
	
	public void clickOnUser() {
		
		clickUm.click();
	}
	
	public void userName(String uname) {
		
		ElementWait.waitForElement("//div[@class='oxd-select-text-input'][1]//preceding::div[@class='oxd-select-text oxd-select-text--active']",20, driver);
	
		userName.sendKeys(uname);
	}
	 
	
	public void userClick() {
		
		ElementWait.waitForElement("//div[@class='oxd-select-text-input'][1]//preceding::div[@class='oxd-select-text oxd-select-text--active']",20, driver);	
			
	
	usclick.click();
	
	}
	

 	public void clickonSelect() {
 		
 		ElementWait.waitForElement("//div[@role='listbox']//div[2]",20, driver);
		
 	
	adminSelect.click();	
	}
	
	
	public void clickEmployeeName() {
		
		employeeName.click();
	}
	
	public void sendEmployeeName(String employee) {
		
		employeeName.sendKeys(employee);
	}
	
	
	public void clickOnStatus() {
		
		status.click();
	}
	
	
	public void clickOnSelect() {
		
		selectStatus.click();
	}
	
	
	public void clickonSearch() {
		
		searchButton.click();
	}
		
	
	
	
	
	
	
	
	
	
	
}
