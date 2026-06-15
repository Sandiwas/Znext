package SelenumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3HandleHiddenDropDown3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

		driver.manage().window().maximize();

		// Login steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		// clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		// clicked on dropdown
		driver.findElement(By.xpath(
				"//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]//div[@class='oxd-select-text--after']"))
				.click();

		System.out.println("-------------1. Select single option-------------------");

//		driver.findElement(By
//				.xpath("//div[contains(@class,'oxd-select-dropdown')]//span[normalize-space()='Full-Time Permanent']"))
//				.click();

		System.out.println("-------------2. capture all the options and find out size-------------------");

		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'oxd-select-dropdown')]//span"));

		System.out.println(list.size());

//		System.out.println("-------------3. printing all options-------------------");
//		
//		for(WebElement option : list) {
//			String names=option.getText();
//			System.out.println(names);
//		}

		System.out.println("-------------4. select multiple options-----------------------");

		for (WebElement option : list) {
			String name = option.getText();
			if (name.equals("Full-Time Permanent")) {
				option.click();
				break;
			}
		}
	}
}
