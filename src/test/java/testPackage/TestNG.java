package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilityPackage.StaticBrowser;



public class TestNG {
	
@BeforeClass
	
	public void beforeClass()
	{
		
	WebDriver driver=StaticBrowser.openBrowser("edge","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("BeforeClass of class2");
	}




	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod of class2");
	}

	@Test
	public void test1()
	{

		System.out.println("test1 of class2");
		
	}

	@Test
	public void test2()
	{
		
		System.out.println("test2 of class2");
	}

	@Test
	public void test3()
	{
		System.out.println("test3 of class2");
	}

	@Test
	public void test4()
	{
		System.out.println("test4 of class2");
	}

	@Test
	public void test5()
	{
		System.out.println("test5 of class2");
	}

	

	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass of class2");
	}	
	
	

}
