package Operations_on_Web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Boolean Visibility = driver.findElement(By.xpath("//span[@id='home']")).isDisplayed();
		System.out.println("Home tab is Displaying or not : " + Visibility );
		Boolean Button_1 =driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
		System.out.println("Button 1 status of Disability is : " + Button_1);
		Boolean Button_2 =driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
		System.out.println("Button 2 status of Disability is : " + Button_2);
		Boolean Book =driver.findElement(By.xpath("//input[@value='Book']")).isSelected();
		System.out.println("Book is Selected  : " + Book);

		
	}

}
