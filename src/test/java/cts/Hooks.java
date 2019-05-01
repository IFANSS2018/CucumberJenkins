package cts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
static WebDriver driver;
@Before
public static void test() {
	System.setProperty("webHooks.driver.chrome.Hooks.driver", "C:\\Users\\1\\eclipse-sivamani\\WebTable\\Hooks.driver\\chromeHooks.driver.exe");
	Hooks.driver= new ChromeDriver();
	Hooks.driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	
}
@After
private static void test2() {
driver.close();
}
}
