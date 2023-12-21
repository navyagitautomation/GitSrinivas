package stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefnition {
	WebDriver driver;
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
	    
		WebDriver driver=new FirefoxDriver();
	this.driver=driver;
		
		driver.get("https://www.facebook.com/");
				
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string);
	}

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) {
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
		}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);

	}


}
