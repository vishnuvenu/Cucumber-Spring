package hooks;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utils.ExtentReportGenerator;


public class StepHooks {

    @BeforeStep
    public void beforeStep(){
        System.out.println("before each step");
    }
    @AfterStep
    public void AfterStep(Scenario scenario){
        System.out.println("after each step");
    }
}
