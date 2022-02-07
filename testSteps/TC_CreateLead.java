package testSteps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_CreateLead extends TC_InitialClass
{
	@When("Click on {string}")
	public void clickLead(String lead)
	{
		driver.findElement(By.linkText(lead)).click();
	}
	
	@When("Click on {string} link")
	public void clickOnCreateLead(String createLead) 
	{
		driver.findElement(By.linkText(createLead)).click();
	}
	
	@When("Click on Company name and enter {string}")
	public void clickOnCompanyName(String company)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	
	@When("Click on First name and enter {string}")
	public void clickOnFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	
	@When("Click on Last name and enter {string}")
	public void clickOnLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	
	@When("Click on email and enter {string}")
	public void email(String email)
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}
	
	@When("Click on {string} option")
	public void clickOnCreateLeadButton(String submit) 
	{
		driver.findElement(By.name(submit)).click();
	}
	
	@Then("View Lead page shoud be displayed")
	public void viewLeadPage() {
		String title = driver.getTitle();
		
		if(title.contains("View Lead"))
		{
			System.out.println(" View Lead Page Loaded Successfully");
		}
		else
		{
			System.out.println("Page not get loaded as expected");
		}
	}
}
