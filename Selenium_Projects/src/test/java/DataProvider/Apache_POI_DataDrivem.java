package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_POI_DataDrivem {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String file = "C:\\Users\\tejas\\Desktop\\datadrivenpractice.xlsx";
		FileInputStream fileInput = new FileInputStream(file);
		XSSFWorkbook work = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = work.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		

	}

}
