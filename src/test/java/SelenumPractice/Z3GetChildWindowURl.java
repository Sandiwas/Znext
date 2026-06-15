package SelenumPractice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z3GetChildWindowURl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowIds = driver.getWindowHandles();

		for (String id : windowIds) {
			if (!id.equals(parentWindow)) {
				driver.switchTo().window(id);
				System.out.println("Child Title : " + driver.getTitle());
				driver.close();
			}

		}
	}
}
