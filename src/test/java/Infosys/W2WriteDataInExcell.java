package Infosys;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W2WriteDataInExcell {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\inf.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("data");

		XSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("Sandip");
		row0.createCell(1).setCellValue("Sachin");
		row0.createCell(2).setCellValue("Suraj");

		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Gahudas");
		row1.createCell(1).setCellValue("Gahudas");
		row1.createCell(2).setCellValue("Gahudas");

		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("Wasekar");
		row2.createCell(1).setCellValue("Wasekar");
		row2.createCell(2).setCellValue("Wasekar");
		wb.write(fo);

		wb.close();
		fo.close();

	}
}
