package june0;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B3ReadDataFromColumn {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rows; i++) {
			String data = sheet.getRow(i).getCell(0).toString();
			System.out.println(data + " ");
		}
		wb.close();
		fi.close();
		System.out.println("Column number is " + cells);
	}
}
