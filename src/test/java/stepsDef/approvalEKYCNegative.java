package stepsDef;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class approvalEKYCNegative extends env_target {
	
	@Then("^user see supervisor comment error message$")
    public void user_see_supervisor_comment_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Supervisor Comment is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ErrorMsgSupervisorCommentApprovalEKYC.png"));
        driver.close();
    }
	
	@Then("^user see actions error message$")
    public void user_see_actions_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Actions is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ErrorMsgActionsApprovalEKYC.png"));
    }
	
	@Then("^user see supervisor comment and actions error message$")
    public void user_see_supervisor_comment_and_actions_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Supervisor Comment is required')]"));
    	driver.findElement(By.xpath("//span[contains(text(),'Actions is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ErrorMsgSupervisorComment&ActionsApprovalEKYC.png"));
    }
	
}