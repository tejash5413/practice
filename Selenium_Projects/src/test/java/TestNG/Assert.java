package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	WebDriver driver;
	@Parameters("broserName")
	@BeforeClass
	public void Open(String broserName) {
		switch (broserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.google.com/");
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");

		default:
			break;
		}


	}
	@Test(priority = 1, description = "Validating page Title")
	public void title() {
		String ActualTitle =driver.getTitle();
		String ExpecTitle = "Google";
		SoftAssert s = new SoftAssert();
		s.assertEquals(ActualTitle, ExpecTitle);
		s.assertAll();
	}
	@AfterClass
	public void Close() {
		driver.close();
	}

}
