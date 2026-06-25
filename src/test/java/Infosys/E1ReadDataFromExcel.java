package Infosys;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class E1ReadDataFromExcel {
	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(0);
		String data00 = row.getCell(0).getStringCellValue();
		String data01 = row.getCell(1).getStringCellValue();
		String data02 = row.getCell(2).getStringCellValue();
		String data03 = row.getCell(3).getStringCellValue();

		System.out.println(data00);
		System.out.println(data01);
		System.out.println(data02);

		System.out.println(data03);

		wb.close();
		fi.close();

	}
}
