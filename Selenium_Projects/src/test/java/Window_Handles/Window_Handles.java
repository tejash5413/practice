package Window_Handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println("title of the page is : " + driver.getTitle());	
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[contains(normalize-space(),'Register Now')]")).click();	
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> tabs_1 = tabs.iterator();
		String Parent =tabs_1.next();
		String Child = tabs_1.next();
		driver.switchTo().window(Child);
		System.out.println("Title of 2nd tab is : " + driver.getTitle());
		driver.manage().window().maximize();
		driver.switchTo().window(Parent);
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("54135413");
		String Text =driver.findElement(By.xpath("//div[contains(text(),'Login to NetBanking')]")).getText();
		System.out.println("Text is : " + Text);
		driver.quit();
	}

}
