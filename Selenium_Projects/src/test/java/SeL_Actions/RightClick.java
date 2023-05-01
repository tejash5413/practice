package SeL_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions acts = new Actions(driver);
		WebElement path =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement path_2 = driver.findElement(By.xpath("(//span[normalize-space()='Delete'])[1]"));
		acts.contextClick(path).moveToElement(path_2).click().build().perform();
		driver.switchTo().alert().accept();
		driver.close();
		

	}

}
