package Testrunner;

import org.junit.runner.RunWith;



import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)

@io.cucumber.junit.CucumberOptions(
		features = ".//Feature/Login.feature",
		glue= "step",
		dryRun=false,
		plugin= {"pretty","json:target/cucumber-reports/reports1.json"}
		)




public class Run {

}
