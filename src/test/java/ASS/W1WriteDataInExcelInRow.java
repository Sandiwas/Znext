package ASS;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W1WriteDataInExcelInRow {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir") + "\\resource\\newExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("data");
		XSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("Sandip");
		row.createCell(1).setCellValue("Gahudas");
		row.createCell(2).setCellValue("Wasekar");

		wb.write(fo);
		wb.close();
		fo.close();

	}
}
