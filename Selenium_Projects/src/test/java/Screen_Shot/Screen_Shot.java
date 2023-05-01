package Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_Shot {
	  static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		Thread.sleep(1000);
		screenshot("D:\\Selenium Assingments\\Test_1.png");
		WebElement clk = driver.findElement(By.xpath("//a[contains(normalize-space(),'Sign Up')]"));
		clk.click();
		//Thread.sleep(2000);
		//screenshot("D:\\Selenium Assingments\\Test_2.png");


	}
   public static void screenshot(String Filename) throws IOException {
	TakesScreenshot scrn = (TakesScreenshot)(driver);
	File src = scrn.getScreenshotAs(OutputType.FILE);
	File des = new File(Filename);
	FileUtils.copyFile(src, des);
}
}
