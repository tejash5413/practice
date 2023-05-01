package DataDriven_1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



	
	
public class NewTest {
	WebDriver driver;
	@BeforeClass
		public void Open() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			}
	
  @Test
  public void f() throws IOException {
	 WebElement user =driver.findElement(By.xpath("(//input[@id='email'])[1]"));
	 WebElement pass = driver.findElement(By.xpath("(//input[@id='pass'])[1]"));
	  String file ="C:\\Users\\tejas\\Downloads\\indiandetails.xlsx";
		FileInputStream inputfile = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputfile);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println("rows"+rows);
		System.out.println("Cols"+cols);
		for(int r=1;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			XSSFCell cell = row.getCell(1);
			String value = cell.getStringCellValue();
			
			switch (cell.getCellType()) {
			case STRING:System.out.println(cell.getStringCellValue());break;
			case NUMERIC: System.out.println(cell.getNumericCellValue());break;
			default:
				break; 
		}
	
		
	}
		
		
  }
}
