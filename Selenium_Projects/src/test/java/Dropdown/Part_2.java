package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.tools.javac.util.Options;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@class,'dropdown1')]//li"));
		for(int i=0;i<list.size();i++) {
			String Options =list.get(i).getText();		
			System.out.println("Dropdown options are : " + Options);
		}
		List<WebElement> list_1 =driver.findElements(By.xpath("//ul[contains(@class,'dropdown1')]//li"));
		for(int j=0;j<list_1.size();j++) {
			String Opt =list_1.get(j).getText();		
			if(Opt.contains("Loans")) {
				list_1.get(j).click();			}
		}
	}

}
