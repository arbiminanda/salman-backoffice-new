package testsuites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import stepsDef.approvalBusinessCampaign;
import utils.Litsteners;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src\\test\\java\\features\\approvalBusinessCampaign.feature",
                glue ={"stepsDef"},
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                tags = {"@All"})

public class TSuitesApprovalBusinessCampaign {
    public static void main(String args[]) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new Litsteners());
        runner.run(approvalBusinessCampaign.class);
    }
}