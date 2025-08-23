package Step_Definition;


import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Ebay_Cucum",
                 glue={"Step_Definition"},
                 plugin= {"pretty","html:target/html/htmlreport.html",
		                           "json:target/json/jsonreport",
		                           "junit:target/junit/junitreport"})
public class TestRunner {
 
}
 
 