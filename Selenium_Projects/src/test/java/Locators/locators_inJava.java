package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators_inJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
 		driver.get("http://sme.spicejet.com/Airline/SMERegister");
        System.out.println(driver.getTitle());
        String  text = driver.findElement(By.linkText("SME Details")).getText();
        System.out.println(text);
          WebElement Id_ = driver.findElement(By.id("smeRegistration_OrganizationName"));
          WebElement Name_ = driver.findElement(By.name("smeRegistration.OtherOrgName"));
          WebElement cssName_ = driver.findElement(By.className("smeRegistration.City"));
          driver.findElement(By.xpath("//h1[contains(text(),'Registration')]"));
        driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']"));
        driver.findElement(By.xpath("//input[@id='//input[@id='OtherOrgName']']"));
        driver.findElement(By.xpath("//button[@name='login']"));
       String title = driver.getTitle();
       System.out.println("Title : " + title);	
        driver.close();
	}

}
