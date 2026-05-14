package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "sendData")
	public void loginTest(String username, String password) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		try {
			boolean status = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
			if (status) {
				System.out.println("Loign  passed");
				driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//child::p[1]")).click();
				driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//child::li[4]")).click();
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			System.out.println("Loign  Failed");
			Assert.assertFalse(false);
		}

	}

	@DataProvider(name = "sendData")
	public Object[][] getData() {
		Object[][] data = { { "Admin", "admin123" }, { "sandip", "sandip123" } };
		return data;
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
