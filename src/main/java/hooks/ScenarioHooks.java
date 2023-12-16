package hooks;

import io.cucumber.java.*;
import org.springframework.beans.factory.annotation.Autowired;
import steps.Config;
import utils.ExtentReportGenerator;

public class ScenarioHooks {



    @BeforeAll
    public static void beforeAll(){
        ExtentReportGenerator.startReport();
    }

    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println("before scenario - Hook");
        ExtentReportGenerator.startTest(scenario.getName());
    }


    @After
    public void afterScenario(Scenario scenario){

        System.out.println("after scenario - Hook");
        ExtentReportGenerator.logTestStatus(scenario);
    }
    @AfterAll
    public static void afterAll(){
        ExtentReportGenerator.endTest();
    }
}
