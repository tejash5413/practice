package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asssin_4 {
	WebDriver driver;
	SoftAssert s = new SoftAssert();
	@BeforeClass
	public void Open() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://sme.spicejet.com/Airline/SMERegister");
	}
	@Test(priority = 1, description = "Validationg Title and URL")
	public void title_url() {
		String Ac_Title = driver.getTitle();
		String Ex_Title = "SpiceJet SME";
		s.assertEquals(Ac_Title, Ex_Title);
		String Ac_Url =driver.getCurrentUrl();
		String Ex_URL = "http://sme.spicejet.com/Airline/SMERegister";
		s.assertEquals(Ac_Url, Ex_URL);
		s.assertAll();
		
	}
	@Test(priority = 2, description = "Checking the fields")
	public void Input_fields() {
		Boolean first = driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']")).isDisplayed();
		s.assertTrue(first);
		Boolean  sec = driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).isDisplayed();
		s.assertTrue(sec);
		Boolean thir = driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_LastName']")).isDisplayed();	
		   s.assertTrue(thir);
		   Boolean four = driver.findElement(By.xpath("(//textarea[@id='smeRegistration_RegisteredAddress'])[1]")).isDisplayed();
		   s.assertTrue(four);
		   Boolean five = driver.findElement(By.xpath("(//input[@id='smeRegistration_City'])[1]")).isDisplayed();
		   s.assertTrue(five);
		   Boolean six = driver.findElement(By.xpath("(//input[@id='smeRegistration_State'])[1]")).isDisplayed();
		   s.assertTrue(six);
		   Boolean sev = driver.findElement(By.xpath("(//input[@id='smeRegistration_Pincode'])[1]")).isDisplayed();
		   s.assertTrue(sev);
		   Boolean eigh = driver.findElement(By.xpath("(//input[@id='smeRegistration_ContactPhone'])[1]")).isDisplayed();
		   s.assertTrue(eigh);
		   s.assertAll();
		   
	}
      @Test(priority = 3, description = "Validating the heading of Registration form")
      public void Text_Vali() {
    	  String Act_form_title =driver.findElement(By.xpath("//h1[normalize-space()='Registration Form']")).getText();
    	  String Exp_form_title = "Registration Form";
    	  s.assertEquals(Act_form_title, Exp_form_title);
      }
      @Test(priority = 4, description = "Color Validation")
      public void Color() {
    	 String Act_color = driver.findElement(By.xpath("//h1[normalize-space()='Registration Form']")).getCssValue("color");
    	 System.out.println(Act_color);
    	 String Exp_color ="rgba(196, 17, 48, 1)";
    	 s.assertEquals(Act_color, Exp_color);
      }
         
@AfterClass
public void Close() {
	driver.close();
}
}
