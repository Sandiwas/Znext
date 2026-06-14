package Interview;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class B4ReadDataFromAllRow {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cells; j++) {
				String data = row.getCell(j).toString();
				System.out.print(data + "  ");
			}
			System.out.println();
		}
		wb.close();
		fi.close();
	}
}
