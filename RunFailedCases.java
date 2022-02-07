package week6.day2;

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class RunFailedCases 
	{
			@Test(dataProvider = "dataFile")
			public void createContact(String compName,String firstName,String lastName)
			{
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
				driver.findElement(By.name("submitButton")).click();
				
		}
			
			@DataProvider(name = "dataFile")
			public String [] [] sendData()
			{
				String[][] data = new String [1][3];
				
				data[0][0] = "Wipro";
				data[0][1] = "Manivel";
				data[0][2] = "R";
				
				return data;
			}
}
