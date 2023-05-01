package KeyBoard_OPs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBOard_OPs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys("Tejash Kumar");
		driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='as_epq']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//input[@name='as_epq']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@name='as_epq']")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//input[@name='as_epq']")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='as_oq']")).sendKeys(Keys.CONTROL+"v");
		driver.close();

	}

}
