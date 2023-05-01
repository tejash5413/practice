package SeL_Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true");
		Actions acts = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//li//a[@id='Login']"));
		WebElement hover_1 = driver.findElement(By.xpath("(//a[normalize-space()='SME Travellers'])[1]"));
		System.out.println(hover_1.getText());
		//acts.moveToElement(hover).perform();
		acts.moveToElement(hover).perform();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='menu-list-login']//li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String links =list.get(i).getText();
			if(links.contains("SME Travellers")) {
				System.out.println(list.get(i).getText());
			}

		}
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> tabs_1 = tabs.iterator();
		String Parent =tabs_1.next();
		String Child = tabs_1.next();
		String Child_2 = tabs_1.next();
		driver.switchTo().window(Child);
		driver.findElement(By.xpath("//a[text()='SIGNUP']")).click();
		driver.switchTo().window(Child_2);
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();



	}

}
