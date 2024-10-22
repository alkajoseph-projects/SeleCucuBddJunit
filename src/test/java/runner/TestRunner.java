package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features" ,
        glue = {"stepDefinitions" , "utils"},
        plugin = {"pretty" , "html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {

}
