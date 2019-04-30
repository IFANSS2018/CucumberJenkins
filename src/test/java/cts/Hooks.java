package cts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
static WebDriver driver;
@Before
public static void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\eclipse-sivamani\\Pomclass\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
}
@After
private static void test2() {
driver.close();
}
}
