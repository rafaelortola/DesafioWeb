package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:RafaelWeb/target/report.html"},
        features = {"C:/RafaelWeb/src/test/Features"},
        tags = {"@smokeTest"},
        glue = {"Steps"},
        monochrome = false,
        dryRun = false,
        strict = true
)

public class Runner {

}
