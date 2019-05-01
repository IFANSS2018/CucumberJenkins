package cts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\AddCust.feature",plugin= {"html:target","rerun:target/failed.txt"},glue="cts",strict=true,monochrome=true)
public class TestRunner {

}
