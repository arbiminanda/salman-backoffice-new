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

public class approvalIslamicContentNegative extends env_target {
	
	@When("^user upload invalid islamic content file$")
    public void user_upload_invalid_islamic_content_file() throws Throwable {
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectPath+ "\\src\\test\\resources\\files\\approvalIslamicContent.pdf");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\UploadInvalidFileApprovalIslamicContentg.png"));
    }
	
	@Then("^user see supervisor comment error message approval islamic content$")
    public void user_see_supervisor_comment_error_message_approval_islamic_content() throws Throwable{
		driver.findElement(By.xpath("//span[contains(text(),'Supervisor Comment is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SupervisorCmtErrorMsgApprovalIslamicContentg.png"));
    }
	
	@Then("^user see islamic content image error message$")
    public void user_see_islamic_content_image_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Upload your image first!')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\IslamicContentImgErrorMsgApprovalIslamicContentg.png"));
        driver.close();
    }
	
}