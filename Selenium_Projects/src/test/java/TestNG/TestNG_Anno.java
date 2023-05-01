package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Anno {
	WebDriver driver;
	
		@Test(priority = 1)
		public void first() {
			 ChromeOptions options = new ChromeOptions();
		     options.addArguments("--disable-notifications");
	         WebDriverManager.chromedriver().setup();
	        driver= new ChromeDriver(options);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("9666641160");
			driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("54135413");
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();	
           

			
		}
		@Test(priority = 2)
		public void Secon() {
			Actions acts = new Actions(driver);
			WebElement Move =driver.findElement(By.xpath("(//*[name()='image'])[1]"));
			acts.moveToElement(Move).click().build().perform();
			
		}
		@Test(priority = 3)
		public void Check() {
			driver.findElement(By.xpath("//div[@class='alzwoclg cqf1kptm siwo0mpr gu5uzgus']")).click();
		}
		@Test(priority = 4)
		public void third() {
			driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		}
		@AfterClass
		public void Close() {
			driver.close();
		}
	}
	


