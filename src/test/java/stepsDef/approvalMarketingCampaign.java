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

public class approvalMarketingCampaign extends env_target {
	
	@When("^user click marketing campaign$")
    public void user_click_marketing_campaign() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Marketing Campaign')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@Then("^user see active approval marketing campaign$")
    public void user_see_active_approval_marketing_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ActiveApprovalMarketingCampaign.png"));
    }
	
	@Then("^user see inactive approval marketing campaign$")
    public void user_see_inactive_approval_marketing_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\InactiveApprovalMarketingCampaign.png"));
    }
	
	@Then("^user see deleted approval marketing campaign$")
    public void user_see_deleted_approval_marketing_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DeletedApprovalMarketingCampaign.png"));
    }
	
	@Then("^user see all approval marketing campaign$")
    public void user_see_all_approval_marketing_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\AllApprovalMarketingCampaign.png"));
    }
	
	@Then("^user see pending approval marketing campaign$")
    public void user_see_pending_approval_marketing_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\PendingApprovalMarketingCampaign.png"));
    }
	
	@When("^user search one account in all approval marketing campaign$")
    public void user_search_one_account_in_all_approval_marketing_campaign() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("R0131");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-code"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchApprovalMarketingCampaign.png"));
        driver.close();
    }
	
	@When("^user click decide approval marketing campaign button$")
    public void user_click_decide_approval_marketing_campaign_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Marketing code')]"))
        ));
    }
	
	@When("^user clear marketing campaign file$")
    public void user_clear_marketing_campaign_file() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Clear')]")).click();
    }
	
	@When("^user upload marketing campaign file$")
    public void user_upload_marketing_campaign_file() throws Throwable {
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(projectPath+ "\\src\\test\\resources\\files\\approvalMarketingCampaign.jpg");
    }
	
	@When("^user click approve approval marketing campaign$")
    public void user_click_approve_approval_marketing_campaign() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
    }
	
	@When("^user click reject approval marketing campaign$")
    public void user_click_reject_approval_marketing_campaign() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
    }
	
	@When("^user click propose to change data approval marketing campaign$")
    public void user_click_propose_to_change_data_approval_marketing_campaign() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Propose to change data')]")).click();
    }
	
	@When("^user fill supervisor comment approval marketing campaign$")
    public void user_fill_supervisor_comment_approval_marketing_campaign() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Supervisor Comment");
    }
	
	@Then("^user see decide approval marketing campaign result$")
    public void user_see_decide_approval_marketing_campaign_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your approval marketing has been submitted')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideApprovalMarketingCampaignResult.png"));
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        driver.close();
    }
}