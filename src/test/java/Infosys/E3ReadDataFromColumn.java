package Infosys;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E3ReadDataFromColumn {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();
		//int cells = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rows; i++) {
			String data = sheet.getRow(i).getCell(0).getStringCellValue();

			System.out.println(data + " ");
		}
		wb.close();
		fi.close();

	}

}
