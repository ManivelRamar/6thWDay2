package testSteps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_DuplicateLead extends TC_InitialClass
{
	String orgName = "";
	@When("Click on {string} button")
	public void findLeadsButton(String findLeads) 
	{
		driver.findElement(By.linkText(findLeads)).click();
	}
	
	@When("Click Email link")
	public void clickEmailLink()
	{
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}
	
	@Given("Enter Email Address as {string}")
	public void enterEmailAddress(String emailAddress)
	{
		driver.findElement(By.xpath("(//label[text()='Email Address:']/following::input)[1]")).sendKeys(emailAddress);	
	}
	
	@When("Click on Find Lead to get results")
	public void findLead() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Then("Click on First result and get FirstName")
	public void clickOnFirstResult() 
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		orgName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	}
	
	@When("Click on Duplicate Lead")
	public void clickOnDuplicate() 
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@When("Click on submit button")
	public void submitButton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Check and confirm the Duplicate Lead")
	public void checkLead() 
	{
		String dupName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(dupName.contains(orgName))
		{
			System.out.println("The Lead has duplicated");
		}
		else
		{
			System.out.println("Lead not get duplicated");
		}
	}

}
