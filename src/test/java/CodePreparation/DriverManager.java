package CodePreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static WebDriver driver;

	private DriverManager() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}


/*
 * Why is it Singleton?
 * 
 * Because:
 * 
 * private static WebDriver driver; 
 * Only one driver instance exists. 
 * private DriverManager() {} 
 * Prevents object creation from outside the class.
 * getDriver() 
 * Creates the driver only once and returns the same instance everytime. 
 * quitDriver() 
 * Closes the browser and sets the driver to null.
 */
/*
 * Singleton Design Pattern ensures that only one instance of a class is created
 * throughout the application and provides a global access point to that
 * instance.
 */

/*
 * A Singleton Class is a class that allows only one object (instance) to be
 * created during the entire application execution and provides a global way to
 * access that object.
 */


/*Characteristics of a Singleton Class
1. Private Constructor
Prevents creating objects using new.
2. Private Static Instance Variable
Holds the single object of the class.
3. Public Static Method
Returns the same object every time.
*/
