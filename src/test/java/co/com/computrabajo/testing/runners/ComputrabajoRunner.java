package co.com.computrabajo.testing.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/co/com/computrabajo/testing/features/computrabajo.feature",
				 glue = "co.com.computrabajo.testing.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)

public class ComputrabajoRunner {

}
