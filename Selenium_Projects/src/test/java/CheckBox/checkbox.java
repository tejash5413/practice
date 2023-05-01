package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.get("https://itera-qa.azurewebsites.net/home/automation");
 List<WebElement> list =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
 System.out.println("Size is"+ list.size());
 
 for(int i = 0;i<list.size();i++) {
	 String opts = list.get(i).getText();
	 System.out.println(opts);
	 list.get(i).click();
 }
	}

}
