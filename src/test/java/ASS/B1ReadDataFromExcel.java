package ASS;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B1ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		// XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFSheet sheet = wb.getSheetAt(0);

		String data00 = sheet.getRow(0).getCell(0).toString();
		String data01 = sheet.getRow(0).getCell(1).getStringCellValue();

		System.out.println(data00);
		System.out.println(data01);
		wb.close();
		fi.close();
	}
}
