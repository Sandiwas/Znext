package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E4ReadDataFromAllRow {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cells; j++) {
				String data = row.getCell(j).toString();
				System.out.print(data + "     ");
			}
			System.out.println();
		}
		wb.close();
		fi.close();
	}

}

//getLastRowNum count start form 0-5 (i<=rows)
//getLastcellNum  count start form  1-4  (i<cell)

//Rows start form 0 (0-5)  ; getLastRowNum method  get last index so for (int i = 0; i <= rows; i++)
//(row cell means column )coloum cell start from 1 (1-4); getLastcellNum method  get not last index so for (int i = 0; i < cell; i++)

//getLastRowNum count start form 0 (i<=rows)
//getLastcellNum  count start form  1  (i<cell)