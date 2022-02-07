package testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_EditLead extends TC_InitialClass
{
	String currentComp = "";
	@When("ed_Enter first name {string}")
	public void firstName(String fName) 
	{
		driver.findElement(By.xpath("//label[text()='First name:']//following::input[@name='firstName'][3]")).sendKeys(fName);
	}
	
	@When("ed_Click on Find Lead to get results")
	public void findLead() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@When("ed_Click on First result")
	public void tc3ClickOnFirstResultingField() 
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("ed_Click on Edit")
	public void edit() 
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Then("ed_Update Company name as {string}")
	public void updateCompanyName(String company) 
	{
		currentComp = company;
		WebElement newCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		newCompany.clear();
		newCompany.sendKeys(company);
	}
	
	
	
	@Then("ed_Check the company name get updated")
	public void checkTheCompName() 
	{
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
	//	if(updatedCompany.contains(currentComp))
	//		System.out.println("The company name updated successfully");
	//	else
	//		System.out.println("The company name not updated");
		
		Assert.assertEquals(updatedCompany, currentComp);
		
		System.out.println("The company name updated successfully");
		
	}
}
