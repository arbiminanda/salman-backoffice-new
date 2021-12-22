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

public class approvalBusinessCampaign extends env_target {
	
	@When("^user click business campaign$")
    public void user_click_business_campaign() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Business Campaign')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@Then("^user see active approval business campaign$")
    public void user_see_active_approval_business_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ActiveApprovalBusinessCampaign.png"));
    }
	
	@Then("^user see inactive approval business campaign$")
    public void user_see_inactive_approval_business_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\InactiveApprovalBusinessCampaign.png"));
    }
	
	@Then("^user see deleted approval business campaign$")
    public void user_see_deleted_approval_business_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DeletedApprovalBusinessCampaign.png"));
    }
	
	@Then("^user see all approval business campaign$")
    public void user_see_all_approval_business_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\AllApprovalBusinessCampaign.png"));
    }
	
	@Then("^user see pending approval business campaign$")
    public void user_see_pending_approval_business_campaign() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\PendingApprovalBusinessCampaign.png"));
    }
	
	@When("^user search one account in all approval business campaign$")
    public void user_search_one_account_in_all_approval_business_campaign() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("testing edit");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-code"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchApprovalBUsinessCampaign.png"));
        driver.close();
    }
	
	@When("^user click decide approval business campaign button$")
    public void user_click_decide_approval_business_campaign_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Quota per Person')]"))
        ));
    }
	
	@When("^user fill supervisor comment approval business campaign$")
    public void user_fill_supervisor_comment_approval_business_campaign() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Supervisor Comment");
    }
	
	
	@When("^user click approve approval business campaign$")
    public void user_click_approve_approval_business_campaign() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
    }
	
	@When("^user click reject approval business campaign$")
    public void user_click_reject_approval_business_campaign() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
    
	}@When("^user click propose to change data approval business campaign$")
    public void user_click_propose_to_change_data_approval_business_campaign() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Propose to change data')]")).click();
    }
	
	@Then("^user see decide approval business campaign result$")
    public void user_see_decide_approval_business_campaign_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideApprovalBusinessCampaignResult.png"));
        driver.close();
    }
}