package IFrameORFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageListFrame");
		List<WebElement> List =driver.findElements(By.xpath("//ul[@title='Packages']//li"));
		for(int i=0;i<List.size();i++) {
			String Names =List.get(i).getText();
			System.out.println("Names List : " + Names);
		}
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		List<WebElement> Interface = driver.findElements(By.xpath("//ul[@title='Interfaces']//li//a//span"));
		for(int j=0;j<Interface.size();j++) {
			String Inter_Names =Interface.get(j).getText();
			System.out.println("Interface Names List : " + Inter_Names);
		}
		driver.findElement(By.xpath("//a//span[text()='WebDriver']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");
		WebElement text =driver.findElement(By.xpath("//li//a[text()='Help']"));
		String text_1 = text.getText();
	    System.out.println("Text is : " + text_1);
	    text.click();
	    
	    driver.close();
	}
	
	

}
