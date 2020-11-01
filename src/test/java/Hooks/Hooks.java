package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String browser;
	public static String baseurl = "E:/February Class/xpath.html";
	
public Hooks() {
	// TODO Auto-generated constructor stub
}

	public static void openBrowser(String browsername, String url) {

		if (driver == null) {

			if (browsername.equals("firefox")) {


			} else if (browsername.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} 

		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	@After
	public static void closeBrowser(Scenario scenario) {
		driver.quit();
	}



}
