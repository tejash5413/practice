package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html#google_vignette");
		List<WebElement> Tabe_Th =driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr//th"));
		System.out.println(Tabe_Th.size());
		List<WebElement> Tabe_tr =driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr"));
		System.out.println(Tabe_tr.size());
		for(int i=2;i<=Tabe_tr.size();i++) {
			for(int j=1;j<=Tabe_Th.size();j++) {
			 System.out.println(driver.findElement(By.xpath("//table[contains(@id,'customers')]//tr["+i+"]//td["+j+"]")).getText()+" ");
				
				
			}
		}
	}

}
