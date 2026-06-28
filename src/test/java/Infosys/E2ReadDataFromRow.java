package Infosys;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E2ReadDataFromRow {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int cells = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < cells; i++) {
			String data = sheet.getRow(0).getCell(i).getStringCellValue();

			System.out.print(data + " ");
		}
		wb.close();
		fi.close();
	}

}
