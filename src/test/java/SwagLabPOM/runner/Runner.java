package SwagLabPOM.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "SwagLabPOM/step_definitions",
        dryRun = false,
        tags = " @SwagLabsTest",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)


public class Runner {
}
