package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W3WriteDynamicDataInExcel {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(".//testData//new2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("data");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number: ");
		int row = sc.nextInt();
		System.out.println("Enter Cell Number: ");
		int cell = sc.nextInt();
		for (int i = 0; i <= row; i++) {
			XSSFRow newRow = sheet.createRow(i);
			for (int j = 0; j < cell; j++) {
				newRow.createCell(j).setCellValue(sc.next());
			}
			System.out.println();
		}
		wb.write(fo);
		wb.close();
		fo.close();
		sc.close();

	}
}
