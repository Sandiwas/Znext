package Excel1;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W1WriteDataInExcell {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir") + "//testData//CreatedExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();

		sheet.createRow(0).createCell(0).setCellValue("Sandip");

		wb.write(fo);
		wb.close();
		fo.close();
	}
}
