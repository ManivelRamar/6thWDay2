package testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_DeleteLead extends TC_InitialClass

{
	String leadID = "";
	@When("Click on First Name and enter the {string}")
	public void clickName(String name) 
	{
		driver.findElement(By.xpath("//label[text()='First name:']//following::input[@name='firstName'][3]")).sendKeys(name);
	}
	
	@When("Click on Find Lead Button")
	public void findLeadButton() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Then("Save First resulting field data and Click it")
	public void firstResultingData() 
	{
		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		leadID = lead.getText();
		lead.click();	
	}
	
	@When("Click on Delete")
	public void delete() 
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@When("Click again Find Leads")
	public void againFindLeads() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Enter the leadID")
	public void enterTheLeadID() throws InterruptedException 
	{
		driver.findElement(By.name("id")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Then("Verify there is no records to display")
	public void verifyThereIsNoRecordsToDisplay() throws InterruptedException 
	{
		WebElement message = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		Thread.sleep(2000);
		String verifyMsg = message.getText();
		
		if(verifyMsg.contains("No records to display"))
			
				System.out.println("Verified the lead was deleted");
		else
				System.out.println("The Lead was not deleted");
	}
}
