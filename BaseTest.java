package suporte;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

	private static WebDriver driver;

	public static WebDriver getDriver() {

		return driver;
	}

	@BeforeClass
	public static void iniciar() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lucas\\Documents\\SELENIUM\\Driver Selenium Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		//Efetuando Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();

	}

	@AfterClass
	public static void finalizar() {
		if (driver != null) {
			driver.quit();
		}

	}

}
