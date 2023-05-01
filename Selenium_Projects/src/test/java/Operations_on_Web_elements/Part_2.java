package Operations_on_Web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://sme.spicejet.com/Airline/SMERegister");
		String Title = driver.getTitle();
		System.out.println("Title is : " + Title);
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL is : " + URL);
		driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).sendKeys("Tejash");
		driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_LastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//textarea[@id='smeRegistration_RegisteredAddress']")).sendKeys("ABCDEFG");
		Select Drop_Down = new Select(driver.findElement(By.xpath("//select[@id='smeRegistration_Region']")));
		Drop_Down.selectByVisibleText("South");
		driver.findElement(By.xpath("//input[@id='smeRegistration_City']")).sendKeys("ABCDEFG");
		driver.findElement(By.xpath("//input[@id='smeRegistration_State']")).sendKeys("ABCDEFG");
		driver.findElement(By.xpath("//input[@id='smeRegistration_Pincode']")).sendKeys("517362");
		driver.findElement(By.xpath("//input[@id='smeRegistration_ContactPhone']")).sendKeys("926372836623");
		driver.findElement(By.xpath("//input[@id='smeRegistration_PANNumber']")).sendKeys("926372836623");
		String Text_Name = driver.findElement(By.xpath("//h1[@class='title-primary pull-left']")).getText();
		System.out.println("Text Name is  : " + Text_Name);
		String Text_Color = driver.findElement(By.xpath("//h1[@class='title-primary pull-left']")).getCssValue("color");
		System.out.println("Text Color is : " + Text_Color);
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
		driver.close();

	}

}
