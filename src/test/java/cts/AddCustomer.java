package cts;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer {
	static WebDriver driver;
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\eclipse-sivamani\\WebTable\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}
	
	/*@When("The user fill the valid customer details")
	public void the_user_fill_the_valid_customer_details() {
	   driver.findElement(By.xpath("//label[text()='Done']")).click();
	   driver.findElement(By.id("fname")).sendKeys("siva");
	   driver.findElement(By.id("lname")).sendKeys("mani");
	   driver.findElement(By.id("email")).sendKeys("siva@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("chennai");
	   driver.findElement(By.name("telephoneno")).sendKeys("7894561233");
	}*/
	
	@When("The user fill the valid customer details")
	public void the_user_fill_the_valid_customer_details(DataTable AddDetails) {
		//List<String> List = AddDetails.asList(String.class);
		Map<String,String> asMap = AddDetails.asMap(String.class, String.class);
		
		   driver.findElement(By.xpath("//label[text()='Done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(asMap.get("fname"));
		   driver.findElement(By.id("lname")).sendKeys(asMap.get("lname"));
		   driver.findElement(By.id("email")).sendKeys(asMap.get("email"));
		   driver.findElement(By.name("addr")).sendKeys(asMap.get("address"));
		   driver.findElement(By.name("telephoneno")).sendKeys(asMap.get("phnum"));
	}
	
	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		 driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the customer id generate")
	public void the_user_should_see_the_customer_id_generate() {
    Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}



}
