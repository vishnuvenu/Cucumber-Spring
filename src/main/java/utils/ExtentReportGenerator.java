package utils;


import com.aventstack.extentreports.ExtentReports;
        import com.aventstack.extentreports.ExtentTest;
        import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.Scenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.ITestResult;
import steps.Config;
import steps.SpringIntegrationTests;

public class ExtentReportGenerator {

    private static ExtentReports extent;
    private static ExtentTest test;



    public static void startReport() {

           ExtentSparkReporter SparkReporter = new ExtentSparkReporter("target\\extent\\extent-report.html");
           extent = new ExtentReports();
           extent.attachReporter(SparkReporter);

    }

    public static void startTest(String testName) {
        test = extent.createTest(testName);
        test.info("this is sample log to be displayed");
        /*
        ExtentTest n1 = test.createNode("node1","node details");
        n1.info("inner node");

         */
    }

    public static void logTestStatus(Scenario result) {
       if( result.isFailed())
        test.log(Status.FAIL, "Test Failed");
       else
           test.log(Status.PASS, "Test Passed");

    }

    public static void endTest() {
        extent.flush();
    }
}
