package extentReport.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

		features = { "Features" }, 
		glue = { "extentReport.stepDefs" }, 
		plugin = { "pretty" }
		//tags= "@Addcrt"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
