package extentReport.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
	//	Features= {"Features"},
		glue= {"extentReport.stepDefs"},
		
		plugin= {"pretty"}
		
		
		
		)




public class MacBookProTestRunner extends AbstractTestNGCucumberTests {

}












