package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E1ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheetAt(0);

		String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
		String data01 = sheet.getRow(0).getCell(1).getStringCellValue();
		int data12 = (int)sheet.getRow(1).getCell(2).getNumericCellValue();
	


		System.out.println(data00);
		System.out.println(data01);
		System.out.println(data12);

		wb.close();
		fi.close();
		
		

	}
}

//Rows start form 0 (0-5)  ; getLastRowNum method  get last index so for (int i = 0; i <= rows; i++)
//(row cell means column )coloum cell start from 1 (1-4); getLastcellNum method  get not last index so for (int i = 0; i < cell; i++)


//getLastRowNum count start form 0 (i<=rows)
//getLastcellNum  count start form  1  (i<cell)