package Interview;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.util.Scanner;

public class W3WriteDynamicDataInExcel {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(".\\testData\\interviewe2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("data1");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row num : ");
		int rows = sc.nextInt();
		System.out.print("Enter Cell num : ");
		int cells = sc.nextInt();

		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < cells; j++) {
				row.createCell(j).setCellValue(sc.next());
			}
			System.out.println();
		}
		wb.write(fo);
		wb.close();
		fo.close();
		sc.close();

	}
}
