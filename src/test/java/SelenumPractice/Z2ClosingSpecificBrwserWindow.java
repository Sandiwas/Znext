package SelenumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z2ClosingSpecificBrwserWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Thread.sleep(5000);
		Set<String> windowIds = driver.getWindowHandles();

		for (String id : windowIds) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("OrangeHRM: All in One HR Software for Businesses | OrangeHRM"))
				driver.close();
		}

	}
}
