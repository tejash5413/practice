package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withOK_CANCEL_SEARCH_INPUT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");;
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println("Text is : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String Name = "Tejash Kumar";
		driver.switchTo().alert().sendKeys(Name);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String V_Name =driver.findElement(By.xpath("//p[@id='result']")).getText();
		if(V_Name.contains(Name)) {
			System.out.println("You entered: " + Name);
		}
		else {
			System.out.println("Something went wrong... Please try again..");
		}
		driver.close();
		

		
	}

}
