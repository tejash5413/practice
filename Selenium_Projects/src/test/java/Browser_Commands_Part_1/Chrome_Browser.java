package Browser_Commands_Part_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://netbanking.hdfcbank.com/netbanking/");
		String Page_Title = chrome.getTitle();
		System.out.println("The Page Title is " + Page_Title );
		String Page_URL = chrome.getCurrentUrl();
		System.out.println("The Page URL is " + Page_URL);
		String Page_Source = chrome.getPageSource();
		System.out.println("The Page source is \n" + Page_Source);
		chrome.close();
		
		} 

}
