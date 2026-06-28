package CodePreparation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage2 {

	public WebDriver driver;
	public WebDriverWait wait;

	public By username = By.id("username");
	public By password = By.id("password");
	public By loginBtn = By.id("loginBtn");

	public LoginPage2(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForVisibility(By ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	}

	public void enterUsername(String user) {
		waitForVisibility(username);
		driver.findElement(username).sendKeys(user);
	}

	public void enterPassword(String pwd) {
		waitForVisibility(password);
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		waitForVisibility(loginBtn);
		driver.findElement(loginBtn).click();
	}

}
