package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNgTestListener implements ITestListener {

	ExtentReports extReport;
	ExtentSparkReporter sparkReporter;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed" );
		ExtentTest test = extReport.createTest("Test ");
		test.pass("Test passed");
		test.assignDevice("Windows 10");
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ExtentTest test = extReport.createTest("Test");
		
		test.log(Status.FAIL, "Test Failed");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on Start");
		
		 extReport = new ExtentReports();
		 sparkReporter = new ExtentSparkReporter("./extent_report/index.html");
		 extReport.attachReporter(sparkReporter);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish");
		extReport.flush();
		
	}
}
