import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources"
//format = {"pretty", "html:target/Destination"}
//glue={"src/test/java"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
