package Barcode_Reader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BarCode {

	public static void main(String[] args) throws IOException, NotFoundException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String Code = driver.findElement(By.xpath("//div[@class='widget-content']//img[2]")).getAttribute("src");
		URL url =new URL(Code);
		BufferedImage bfimg = ImageIO.read(url);
		LuminanceSource lisrc = new BufferedImageLuminanceSource(bfimg);
		BinaryBitmap bibitmap = new BinaryBitmap(new HybridBinarizer(lisrc));
		Result result = new MultiFormatReader().decode(bibitmap);
		System.out.println(result.getText());
		
driver.close();
	}

}
