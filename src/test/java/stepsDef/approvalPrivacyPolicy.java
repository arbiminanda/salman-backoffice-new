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

public class approvalPrivacyPolicy extends env_target {
	
	@When("^user click privacy policy$")
    public void user_click_privacy_policy() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Privacy Policy')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@Then("^user see active approval privacy policy$")
    public void user_see_active_approval_privacy_policy() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ActiveApprovalPrivacyPolicy.png"));
    }
	
	@Then("^user see inactive approval privacy policy$")
    public void user_see_inactive_approval_privacy_policy() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\InactiveApprovalPrivacyPolicy.png"));
    }
	
	@Then("^user see pending approval privacy policy$")
    public void user_see_pending_approval_privacy_policy() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\PendingApprovalPrivacyPolicy.png"));
    }
	
	@When("^user search one account in active approval privacy policy$")
    public void user_search_one_account_in_active_approval_privacy_policy() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();	
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("[Edited] Create PP via Backoffice");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-title"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchActiveApprovalPrivacyPolicy.png"));
    }
	
	@When("^user search one account in inactive approval privacy policy$")
    public void user_search_one_account_in_inactive_approval_privacy_policy() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("Testing Privacy Policy");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-title"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchInactiveApprovalPrivacyPolicy.png"));
    }
	
	@When("^user search one account in pending approval privacy policy$")
    public void user_search_one_account_in_pending_approval_privacy_policy() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("Title web add new campaign 3");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-title"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchPendingApprovalPrivacyPolicy.png"));
    }
	
	@When("^user click decide approval privacy policy button$")
    public void user_click_decide_approval_privacy_policy_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Privacy Policy')]"))
        ));
    }
	
	@When("^user fill supervisor comment approval privacy policy$")
    public void user_fill_supervisor_comment_approval_privacy_policy() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Supervisor Comment");
    }
	
	
	@When("^user click approve approval privacy policy$")
    public void user_click_approve_approval_privacy_policy() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
    }
	
	@When("^user click reject approval privacy policy$")
    public void user_click_reject_approval_privacy_policy() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
    
	}@When("^user click propose to change data approval privacy policy$")
    public void user_click_propose_to_change_data_approval_privacy_policy() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Propose to change data')]")).click();
    }
	
	@Then("^user see decide approval privacy policy result$")
    public void user_see_decide_approval_privacy_policy_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideApprovalPrivacyPolicyResult.png"));
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        driver.close();
    }
}