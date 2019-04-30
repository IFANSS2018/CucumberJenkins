package cts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature",tags= {"~@rohit","~@kalai"},glue="cucumber2",plugin="html:target",monochrome=true)
public class TestRunner {

}
