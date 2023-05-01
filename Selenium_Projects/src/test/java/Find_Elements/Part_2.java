package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement kk = driver.findElement(By.xpath("//input[@name='q']"));
		kk.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> List =driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = List.size();
		System.out.println("Count : " + count);
		for(int i=0;i<=count;i++) {
			String Sugg = List.get(i).getText();
			System.out.println("Suggetions are : " + Sugg);
			if(Sugg.contains("download")) {
				List.get(i).click();
				break;
			}
		}
	}

}
