package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderClass {
	WebDriver driver;
  @Test(dataProvider = "data")
  public void Open(String userName, String Password) {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
	  driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(Password);
	  driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
  }
  @DataProvider(name="data")
  public Object[][] login() {
	  Object[][] data = new Object[2][2];
	  data[0][0] = "Admin";
	  data[0][1]="1234";
	  data[1][0]="ADMIN";
	  data[1][1]="Admin123";    
	  return data;
  }
}
