package SeL_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/#dblclick");
		WebElement frame =driver.findElement(By.xpath("//div[contains(@class,'demo code-demo')]//iframe"));
		driver.switchTo().frame(frame);
		Actions acts = new Actions(driver);
		WebElement path =driver.findElement(By.xpath("//body//div"));
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView()", path);
		String color = path.getCssValue("color");
		System.out.println(color);
		acts.doubleClick(path).perform();
		String color_2 = path.getCssValue("color");
		System.out.println(color_2);
		driver.close();

	}

}
