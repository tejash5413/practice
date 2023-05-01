package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement> List =driver.findElements(By.xpath("//a"));
		int counts = List.size();
		System.out.println("Link Counts : " + counts);
		for(int i=1;i<counts;i++) {
					String Link_List =List.get(i).getText();
			System.out.println("Total no.of Links are : \r " + Link_List );
		}
	}

}
