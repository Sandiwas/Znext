package SelenumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		/*
		 * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(
		 * "C:\\Users\\sandiwas\\Pictures\\Selenium\\37\\Day-37.txt");
		 * 
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals(
		 * "Day-37.txt")) { System.out.println("File is sucessfully uploaded"); }else {
		 * System.out.println("Upload failed."); }
		 */
		
		String text1 = "C:\\Users\\sandiwas\\Pictures\\Selenium\\37\\Day-37.txt";
		String text2 = "C:\\Users\\sandiwas\\Pictures\\Selenium\\37\\Day-37 - Copy.txt";

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(text1 + "\n" + text2);

		int filecount = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();

		if (filecount == 2) {
			System.out.println("All Files are uploaded");
		} else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}

		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='fileList']/li"));
		String filename1 = list.get(0).getText();
		String filename2 = list.get(1).getText();
		System.out.println(filename1);
		System.out.println(filename2);

		if (filename1.equals("Day-37.txt") && filename2.equals("Day-37 - Copy.txt")) {
			System.out.println("File names matching..");
		} else {
			System.out.println("File names not matching..");
		}
	}

}
