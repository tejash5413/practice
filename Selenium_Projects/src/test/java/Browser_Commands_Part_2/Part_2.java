package Browser_Commands_Part_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='ast-button']")).click();
		String Current_Title = driver.getTitle();
		System.out.println("Current page URL is : " + Current_Title);
		String Page_Source = driver.getPageSource();
		System.out.println("Page source code is : \n " + Page_Source);
		driver.quit();
	}

}
