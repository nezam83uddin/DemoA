package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbsPage.AbsPages;
import Hooks.Hooks;

public class Page extends AbsPages{
	
	public static WebDriver driver;
	
	public Page() {
		this.driver=Hooks.driver;
	}
	
	
	public void testCase_01() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).sendKeys("Sajib");
	}
	

	@Override
	public void loginPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logOutPage() {
		// TODO Auto-generated method stub
		
	}
	
	
	

	

}
