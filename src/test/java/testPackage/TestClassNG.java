package testPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.AdminPage;
import pomPackage.HomePage;
import pomPackage.LoginPage;
import utilityPackage.ReadFileData;

public class TestClassNG extends BaseClass {
	WebDriver driver;	
	LoginPage logp;
	ReadFileData d;
	HomePage hmP;
	AdminPage adminP1;
	
	
@BeforeClass
public void beforeClass() throws InterruptedException
{

	
	      
	 
	   
	   
}
	
@BeforeMethod
public void beforeMethod()
{
	 logp=new LoginPage(BaseClass.driver);
	 
	 hmP=new HomePage(BaseClass.driver) ;
	   adminP1= new AdminPage(BaseClass.driver);
	 
}

@Test
public void test1() throws EncryptedDocumentException, IOException
{
	
	 
	
	logp.SendUN(d.fetchDataFromExcel(2,0));	
	
	logp.sendpass(d.fetchDataFromExcel(2,1));
	logp.clickonlogin();
	
	SoftAssert s=new SoftAssert();
	
	String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String CurrentUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNum";
	s.assertEquals(CurrentUrl,ExpectedURL);		
	s.assertAll();
	//boolean re1=logp.displayedLogin(); not working
	//Assert.assertTrue(re1); // not working 
	//Assert.assertTrue(result1);
	boolean result1=logp.compareUrl();
	//s.assertFalse(result1);
	s.assertTrue(result1);//pass test
//	s.assertAll();
	Assert.fail();
}

@Test
public void test2()
{
	
	hmP.adminClick();
	hmP.admintext();
	hmP.adminIsSelected();

	
}

@Test
public void test3() throws EncryptedDocumentException, IOException
{
	
	adminP1.UseManClick();
	
	adminP1.clickOnUser();
	
	adminP1.userName(d.fetchDataFromExcel(3,0));
	
	adminP1.userClick();
	
	adminP1.clickonSelect();
	
	adminP1.clickEmployeeName();
	
	adminP1.sendEmployeeName(d.fetchDataFromExcel(3,1));
	adminP1.clickOnStatus();
	
	adminP1.clickOnSelect();
	
	adminP1.clickonSearch();
	
	
	
	
	
	
	
}


	


@AfterClass
public void afterClass()
{
	
}




}
