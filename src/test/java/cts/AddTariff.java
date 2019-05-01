package cts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {
	static WebDriver driver;
	@Given("the user is in add triff plan")
	public void the_user_is_in_add_triff_plan() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\eclipse-sivamani\\WebTable\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("the user fill valid details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_valid_details(String MonRen, String LocMin, String InterMin, String SMSPack, String LocMinChar, String InterMinChar, String SMSsChar) {
		 driver.findElement(By.id("rental1")).sendKeys(MonRen);
		   driver.findElement(By.id("local_minutes")).sendKeys(LocMin);
		   driver.findElement(By.id("inter_minutes")).sendKeys(InterMin);
		   driver.findElement(By.name("sms_pack")).sendKeys(SMSPack);
		   driver.findElement(By.name("minutes_charges")).sendKeys(LocMinChar);
		   driver.findElement(By.name("inter_charges")).sendKeys(InterMinChar);
		   driver.findElement(By.name("sms_charges")).sendKeys(SMSPack);
	}

	@When("the user click submit button")
	public void the_user_click_submit_button() {
		 driver.findElement(By.name("submit")).click();
	}

	@Then("the user see the successfll message")
	public void the_user_see_the_successfll_message() {
		 Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	}

}
