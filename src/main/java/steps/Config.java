package steps;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.Scope;
        import org.springframework.stereotype.Component;

        import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Configuration
@ComponentScan
@Component
public class Config {

    @Bean
    @Scope(SCOPE_CUCUMBER_GLUE)
    public TestENV getTestENV( ) {
        return new TestENV();
    }
}
