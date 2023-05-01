package Browser_Commands_Part_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver Edge = new EdgeDriver();
		Edge.get("https://netbanking.hdfcbank.com/netbanking/");
		String Page_Title = Edge.getTitle();
		System.out.println("The Page Title is " + Page_Title );
		String Page_URL = Edge.getCurrentUrl();
		System.out.println("The Page URL is " + Page_URL);
		String Page_Source = Edge.getPageSource();
		System.out.println("The Page source is \n" + Page_Source);
		Edge.close();	
		}
	}


