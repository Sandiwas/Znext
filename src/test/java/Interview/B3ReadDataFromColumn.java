package Interview;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B3ReadDataFromColumn {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();

		for (int i = 0; i <= rows; i++) {
			String data = sheet.getRow(i).getCell(0).toString();
			System.out.println(data + "  ");
		}
		wb.close();
		fi.close();
	}

}
