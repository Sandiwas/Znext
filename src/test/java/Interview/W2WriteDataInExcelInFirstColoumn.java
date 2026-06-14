package Interview;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class W2WriteDataInExcelInFirstColoumn {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(".\\testData\\interview.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet1");

		XSSFRow row0 = sheet.createRow(0);
		XSSFRow row1 = sheet.createRow(1);
		XSSFRow row2 = sheet.createRow(2);

		row0.createCell(0).setCellValue("Sandip");
		row0.createCell(1).setCellValue("Gahudas");
		row0.createCell(2).setCellValue("Wasekar");

		row1.createCell(0).setCellValue("Sachin");
		row1.createCell(1).setCellValue("Gahudas");
		row1.createCell(2).setCellValue("Wasekar");

		row2.createCell(0).setCellValue("Sachin");
		row2.createCell(1).setCellValue("Gahudas");
		row2.createCell(2).setCellValue("Wasekar");

		wb.write(fo);
		wb.close();
		fo.close();

		System.out.println("Data write In Excel done");

	}
}
