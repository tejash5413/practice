package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub
		
		String file ="./src/test/java/testpract.xlsx";
		FileInputStream inputfile = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputfile);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("rows"+rows);
		System.out.println("Cols"+cols);
		
		for(int r=1;r<rows;r++) {
			for(int c =0;c<cols;c++) {
				DataFormatter def = new DataFormatter();
				System.out.println(def.formatCellValue(sheet.getRow(r).getCell(c)));
			}
		System.out.println();
			
		}
		workbook.close();
		inputfile.close();

	}

}
