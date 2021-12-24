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

public class approvalMarketingCampaignNegative extends env_target {
	
	@When("^user upload invalid marketing campaign file$")
    public void user_upload_invalid_marketing_campaign_file() throws Throwable {
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectPath+ "\\src\\test\\resources\\files\\approvalMarketingCampaign.pdf");
    }
	
	@Then("^user see invalid marketing campaign file error message$")
    public void user_see_invalid_marketing_campaign_file_error_message() throws Throwable{
		driver.findElement(By.xpath("//span[contains(text(),'file not support, file is should type image/png,image/jpg,image/jpeg,image/gif')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\UploadInvalidFileApprovalMarketingCampaigng.png"));
    }
	
	@Then("^user see supervisor comment error message approval marketing campaign$")
    public void user_see_supervisor_comment_error_message_approval_marketing_campaign() throws Throwable{
		driver.findElement(By.xpath("//span[contains(text(),'*Supervisor Comment is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SupervisorCmtErrorMsgApprovalMarketingCampaigng.png"));
    }
	
	@Then("^user see supervisor comment and marketing image error message$")
    public void user_see_supervisor_comment_and_marketing_image_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'*Supervisor Comment is required')]"));
    	driver.findElement(By.xpath("//span[contains(text(),'*Image is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SupervisorCmt&MarketingImgErrorMsgApprovalMarketingCampaigng.png"));
    }
	
	@Then("^user see marketing image error message$")
    public void user_see_marketing_image_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'*Image is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\MarketingImgErrorMsgApprovalMarketingCampaigng.png"));
        driver.close();
    }
	
}