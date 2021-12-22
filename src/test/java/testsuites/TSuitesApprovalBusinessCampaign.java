package testsuites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src\\test\\java\\features\\approvalBusinessCampaign.feature",
                glue ={"stepsDef"},
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                tags = {"@TS02"})

public class TSuitesApprovalBusinessCampaign {

}