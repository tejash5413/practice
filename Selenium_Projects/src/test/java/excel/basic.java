package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
@Test(dataProvider = "ex" , dataProviderClass = datasupplier.class)
	public void testlogin(String Username, String Password) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
driver.findElement(By.xpath("//button[@name='login']")).click();

driver.quit();

	}

}
