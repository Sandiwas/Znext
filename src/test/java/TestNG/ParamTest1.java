package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest1 {
	WebDriver driver;

	@BeforeClass()
	@Parameters({ "browser" })
	public void setup(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("invalid browser");
			return;
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "sendData")
	public void loginTest(String username, String password) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		boolean status = driver.findElements(By.xpath("//h6[normalize-space()='Dashboard']")).size() > 0;
		System.out.println(status);
		if (status) {
			System.out.println("Loign  passed");
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//child::p[1]")).click();
			driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//child::li[4]")).click();
			Assert.assertTrue(true);
		} else {
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
