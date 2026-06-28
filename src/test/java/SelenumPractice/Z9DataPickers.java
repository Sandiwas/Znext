package SelenumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z9DataPickers {
	public static void main(String[] args) {
		String date = "10";
		String month = "June";
		String year = "2025";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#datepicker")).click();
		pastDate(driver, month, date, year);

	}

	public static void futureDate(WebDriver driver, String month, String date, String year) {
		while (true) {
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
			// driver.findElement(By.cssSelector("span[class='ui-icon
			// ui-icon-circle-triangle-w']")).click();
		}
		List<WebElement> alldatesize = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldatesize) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static void pastDate(WebDriver driver, String month, String date, String year) {
		while (true) {
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> alldatesize = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldatesize) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
}
