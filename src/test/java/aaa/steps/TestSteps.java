package aaa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Hooks.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages .*;

public class TestSteps extends Page{
	
	WebDriver driver;
	Page page;
	
	public TestSteps(WebDriver driver) {
		this.driver=Hooks.driver;
	}
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		Hooks.openBrowser("chrome", "https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Sajib");
	}

	@When("I complete action")
	public void i_complete_action() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	}

}
