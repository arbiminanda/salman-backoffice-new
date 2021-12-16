package testsuites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src\\test\\java\\features\\customerAccountVerifications.feature",
                glue ={"stepsDef"},
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                tags = {"@All"})

public class TSuitesCustomerAccVerifications {

}