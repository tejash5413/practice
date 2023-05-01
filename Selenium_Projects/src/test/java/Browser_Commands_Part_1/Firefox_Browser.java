package Browser_Commands_Part_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver fox = new FirefoxDriver();
		fox.get("https://netbanking.hdfcbank.com/netbanking/");
		String Page_Title = fox.getTitle();
		System.out.println("The Page Title is " + Page_Title );
		String Page_URL = fox.getCurrentUrl();
		System.out.println("The Page URL is " + Page_URL);
		String Page_Source = fox.getPageSource();
		System.out.println("The Page source is \n" + Page_Source);
		fox.close();	}
	}


