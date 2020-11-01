package AbsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Hooks.Hooks;

public abstract class AbsPages implements BasePage {
	WebDriver driver;
	
	public AbsPages() {
		this.driver = Hooks.driver;
	}
	
	
	@Override
	public void homePage() {
		
		
	}

	@Override
	public abstract void loginPage();

	@Override
	public abstract void logOutPage() ;

}
