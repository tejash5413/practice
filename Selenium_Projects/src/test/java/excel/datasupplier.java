package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class datasupplier {
@DataProvider(name = "ex")
	public String[][] getData() throws IOException {
		// TODO Auto-generated method stub

		String file ="./src/test/java/testpract.xlsx";
		FileInputStream inputfile = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputfile);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("rows"+rows);
		System.out.println("Cols"+cols);
		String[][] data = new String[rows-1][cols];
		for(int r=0;r<rows-1;r++) {
			for(int c =0;c<cols;c++) {
				DataFormatter def = new DataFormatter();
				data[r][c] = (def.formatCellValue(sheet.getRow(r+1).getCell(c)));
			}
		System.out.println();
			
		}
		workbook.close();
		inputfile.close();
		return data;
	}

}
