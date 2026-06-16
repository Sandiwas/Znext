package SelenumPractice;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z5HandleAlerts {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		// Normal alert with Ok button
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		// driver.switchTo().alert().accept();

//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();

		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);

		//driver.switchTo().alert().accept();
	
	    //driver.switchTo().alert().dismiss();
		// Alert alert = driver.switchTo().alert();
		// System.out.println(alert.getText());
		// System.out.println(alert.getText());
		// alert.accept(); alert.dismiss();
		// 3. Promt alert
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("selenium");
//		Thread.sleep(5000);
//		alert.accept();
		//driver.quit();
		
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
//		String text=alert.getText();
//		System.out.println(text);
//        alert.sendKeys("selenium");
//        alert.accept();
	}
}
