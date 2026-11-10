package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", 
				dryRun = !true, 
				glue = {"steps", "baseHooks"}, 
				tags = "@tc01", 
				snippets = CucumberOptions.SnippetType.CAMELCASE,
				plugin = {
					"pretty"				
             			}				
		)
				
public class Runner extends AbstractTestNGCucumberTests {

}
