package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"StepDefinition"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
        //{"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
        // {"pretty", "html:target/cucumber-reports.html"}) or use .json


public class runner {

}