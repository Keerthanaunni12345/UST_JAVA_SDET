package StepDefenition;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/mercury.feature",glue= {"StepDefenition"},
monochrome=true)

public class StepRunner extends AbstractTestNGCucumberTests {

}
