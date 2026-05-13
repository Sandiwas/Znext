package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W1WriteDataInExcell {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(".\\testData\\data1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();

		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Automation is fun");
		
		wb.write(fo);
		wb.close();
		fo.close();
	}
}
