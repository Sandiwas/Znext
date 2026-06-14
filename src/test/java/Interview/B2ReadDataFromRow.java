package Interview;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B2ReadDataFromRow {
	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream(".//testData//data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheetAt(0);

		int cells = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < cells; i++) {
			String data = sheet.getRow(0).getCell(i).toString();
			System.out.print(data + " ");

		}
		wb.close();
		fi.close();
	}
}
