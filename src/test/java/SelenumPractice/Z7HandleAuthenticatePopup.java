package SelenumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z7HandleAuthenticatePopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		System.out.println("done");

	}

}
