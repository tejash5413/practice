package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part_1_Select_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.findElement(By.xpath("//input[contains(@maxlength,'61')]")).sendKeys("Tejash Kumar");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("tejash5413");
		driver.findElement(By.xpath("//input[contains(@value,'availability')]")).click();
		Thread.sleep(500);
		String MSG =driver.findElement(By.xpath("//div[@id='check_availability']//b[1]")).getText();
		System.out.println("The Given ID for the mail is : " + MSG);
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Thejared21160");
		driver.findElement(By.xpath("(//input[@id='newpasswd1'])")).sendKeys("Thejared21160");
		driver.findElement(By.xpath("//input[contains(@maxlength,'100')]")).sendKeys("theja1160@gmail.com");
		driver.findElement(By.xpath("//div[@onclick='javascript: openDiv(event);']")).click();
		List<WebElement> Country_Code = driver.findElements(By.xpath("//li[contains(@onclick,'javascript')]"));
		int count = Country_Code.size();
		System.out.println("Counts : " + count);
		for(int i=1;i<count;i++) {         
			String Names =Country_Code.get(i).getText();
			System.out.println("Country Names are : "+Names);
			if(Names.contains("Australia")) {
				Country_Code.get(i).click();
				break;}}
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9666641160");
		WebElement Day =driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		     Select Day_1 = new Select(Day);
		     Day_1.selectByVisibleText("12");
		     
		WebElement Month =driver.findElement(By.xpath("//select[contains(@name,'Month')]"));
			 Select Month_1 = new Select(Month);
			 Month_1.selectByVisibleText("JAN");
		WebElement Year =driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
			 Select Year_1 = new Select(Year);
			 Year_1.selectByVisibleText("1999");
		boolean Gender =driver.findElement(By.xpath("//input[@value='m']")).isSelected();
			  System.out.println("If, By Default Gender Male selected will come True else False : " + Gender);
		driver.findElement(By.xpath("//input[@value='f']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		WebElement Country_List =driver.findElement(By.xpath("//select[@id='country']"));
		Select CTRYLI = new Select(Country_List);
		Boolean Mul = CTRYLI.isMultiple();
		System.out.println("Country Dropdownload is multi selected drop down  : " + Mul);
		List<WebElement> CTR_LIST =CTRYLI.getOptions();
		int CTR_COUNT = CTR_LIST.size();
		for(int i=1;i<CTR_COUNT;i++) {
			String Nations_LIst = CTR_LIST.get(i).getText();
			System.out.println("All Country Names are : " + Nations_LIst);
		}
		String First_SE = CTR_LIST.get(0).getText();  
		System.out.println("By Default selected country is : " + First_SE);
		CTRYLI.selectByVisibleText("Togo");
		Thread.sleep(500);
		CTRYLI.selectByVisibleText("India");
		WebElement City = driver.findElement(By.xpath("//select[contains(@name,'city')]"));
		Select City_List = new Select(City);
		City_List.selectByVisibleText("Bangalore");
		driver.findElement(By.xpath("//input[@id='Register']")).click();
	}}
	
	


