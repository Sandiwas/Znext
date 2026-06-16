package SelenumPractice;

import java.time.Duration;import java.util.TooManyListenersException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z8StaticTable {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

		// 1) find total number of rows in a table
		int rows = driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size();
		System.out.println("size of row " + rows); // 7

		// 2) find total number of columns in a table
		int columns = driver.findElements(By.xpath("//*[@name='BookTable']//tr//th")).size();
		// System.out.println("size of row " + columns); // 4

		// 3) Read data from specific row and column (ex: 5th row and 1st colum)

		String bookName = driver.findElement(By.xpath("//*[@name='BookTable']//tr[5]//td[1]")).getText();
		// System.out.println("BookName : " + bookName); // Master In Selenium

		// System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");

		// 4) read data from all the rows and colums
//		for (int i = 2; i <= rows; i++) {
//			for (int j = 1; j <= columns; j++) {
//				String data = driver.findElement(By.xpath("//*[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
//				System.out.print(data +"\t");
//			}
//			System.out.println();
//		}
		// 5) Print book names whose author is Mukesh

//		for (int i = 2; i <= rows; i++) {
//			String author = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + i + "]//td[2]")).getText();
//			if (author.equals("Mukesh")) {
//				String bookname = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + i + "]//td[1]"))
//						.getText();
//				System.out.println(bookname);
//			}
//		}
		int total=0;
		//6) Find total price of all the books
		for (int i = 2; i <= rows; i++) {
			String price = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + i + "]//td[4]")).getText();
			 total=total+Integer.parseInt(price);
		}
		System.out.println(total);//7100
	}
}
