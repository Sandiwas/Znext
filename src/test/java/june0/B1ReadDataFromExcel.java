package june0;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B1ReadDataFromExcel {
	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream(".\\testData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
		String data01 = sheet.getRow(1).getCell(0).toString();
		
		System.out.println(data01);
		System.out.println(data00);
		
		wb.close();
		fi.close();
	}
}
