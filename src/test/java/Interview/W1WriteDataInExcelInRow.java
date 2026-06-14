package Interview;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class W1WriteDataInExcelInRow {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(".\\testData\\interview1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("data");
		
		sheet.createRow(0).createCell(0).setCellValue("sandip");
		wb.write(fo);
		
		wb.close();
		fo.close();
	

	}
}
