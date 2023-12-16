package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class Steps extends SpringIntegrationTests {

   @Autowired
    Config config;

    @Given("{int} integer no")
    public void integer_no(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       log.info(" this is from given");

    }
    @When("add {string} with {string}")
    public void add_with(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        log.info(" this is from when");
    }
    @Then("result is {string}")
    public void result_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        log.info(" this is from then");
    }


}
