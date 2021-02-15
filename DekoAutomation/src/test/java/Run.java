import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features",
        glue = {"StepDefinitions"},
        monochrome = true,
        dryRun = false


)

public class Run {
}
