package testSteps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_CreateContact extends TC_InitialClass
{
	@When("Click on Contacts")
	public void clickOnContacts() 
	{
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	@When("Click on Create Contact")
	public void createContact() 
	{
		driver.findElement(By.linkText("Create Contact")).click();
	}
	
	@Given("Click on First Name and enter {string}")
	public void firstName(String firstName) 
	{
		driver.findElement(By.id("firstNameField")).sendKeys(firstName);
	}
	
	@Given("Click on Last Name and enter {string}")
	public void lastName(String lastName) 
	{
		driver.findElement(By.id("lastNameField")).sendKeys(lastName);
	}
	
	@When("Click on submit")
	public void clickOnSubmit() 
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then("Get title and verify the Title contains View Contact")
	public void verifyTheTitle() 
	{
		String title = driver.getTitle();

		if(title.contains("View Contact"))
		{
			System.out.println(" View Contact Page Loaded Successfully");
		}
		else
		{
			System.out.println("Page not get loaded as expected");
		}
	}
}
