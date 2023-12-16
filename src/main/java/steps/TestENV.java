package steps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@PropertySource("classpath:application.yml")
@Scope(SCOPE_CUCUMBER_GLUE)
public class TestENV {

    @Value("${env}")
    private String env;

    public String getEnv() {
        return env;
    }
}
