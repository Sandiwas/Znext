package june0;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B2ReadDataFromRow {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(1).getLastCellNum();

		for (int i = 0; i < cells; i++) {
			String data = sheet.getRow(0).getCell(i).toString();
			System.out.print(data + " ");
		}
		System.out.println("\n" + rows);
		wb.close();
		fi.close();

	}
}


//Rows start form 0 (0-5) ; getLastRowNum method get last index so for (int i =
//0; i <= rows; i++)
//(row cell means column )coloum cell start from 1 (1-4); getLastcellNum method
//get not last index so for (int i = 0; i < cell; i++)

//getLastRowNum count start form 0 (i<=rows)
//getLastcellNum count start form 1 (i<cell)