package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	 WebDriver driver;
	 WebDriverWait wait;
	
	

	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement AdminB;
	
	
	public  HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(20));	
	}
	
	

	
	public void adminClick() {
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']"))); 
		 AdminB.click();
		
	}
	
	
	public void admintext() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
		 AdminB.getText();
	}
	
	
	public void adminIsSelected() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
		 System.out.println(AdminB.isSelected());
		
	}
	
	public void adminIsEnabled()
	{
		boolean r=AdminB.isEnabled();
		
		if(r==true)
		{
			System.out.println("adminbutton is clickable");
		}
		else
		{
			System.out.println("adminbutton is NOT clickable");
		}
		
		
	
	
	
	
	
	
	}	

}
