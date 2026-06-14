package Interview;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class B1ReadDataFromExcel {
	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
		String data01 = sheet.getRow(0).getCell(1).getStringCellValue();
		String data02 = sheet.getRow(0).getCell(2).getStringCellValue();
		String data03 = sheet.getRow(0).getCell(2).getStringCellValue();

		System.out.print(data00 + " ");
		System.out.print(data01 + " ");
		System.out.print(data02 + " ");
		System.out.print(data03 + " ");
		wb.close();
		fi.close();

	}
}
