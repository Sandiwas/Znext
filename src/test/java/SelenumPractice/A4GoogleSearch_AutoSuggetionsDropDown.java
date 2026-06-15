package SelenumPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4GoogleSearch_AutoSuggetionsDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/div//div[@role='option']"));

		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String option = list.get(i).getText();
			if (option.equals("selenium")) {
				list.get(i).click();
				break;
			}
		}
	}
}
