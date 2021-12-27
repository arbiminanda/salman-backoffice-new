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

public class approvalTermsAndConditions extends env_target {
	
	@When("^user click terms and conditions$")
    public void user_click_terms_and_conditions() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Terms & Conditions')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@Then("^user see active approval terms and conditions$")
    public void user_see_active_approval_terms_and_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ActiveApprovalTermsAndConditions.png"));
    }
	
	@Then("^user see inactive approval terms and conditions$")
    public void user_see_inactive_approval_terms_and_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\InactiveApprovalTermsAndConditions.png"));
    }
	
	@Then("^user see pending approval terms and conditions$")
    public void user_see_pending_approval_terms_and_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\PendingApprovalTermsAndConditions.png"));
    }
	
	@When("^user search one account in active approval terms and conditions$")
    public void user_search_one_account_in_active_approval_terms_and_conditions() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();	
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("Create TnC for Notif 2");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-title"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchActiveApprovalTermsAndConditions.png"));
    }
	
	@When("^user search one account in inactive approval terms and conditions$")
    public void user_search_one_account_in_inactive_approval_terms_and_conditions() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("coba term 2 edit");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-title"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchInactiveApprovalTermsAndConditions.png"));
    }
	
	@When("^user search one account in pending approval terms and conditions$")
    public void user_search_one_account_in_pending_approval_terms_and_conditions() throws Throwable {
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
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchPendingApprovalTermsAndConditions.png"));
    }
	
	@When("^user click decide approval terms and conditions button$")
    public void user_click_decide_approval_terms_and_conditions_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Terms & Condition')]"))
        ));
    }
	
	@When("^user fill supervisor comment approval terms and conditions$")
    public void user_fill_supervisor_comment_approval_terms_and_conditions() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Supervisor Comment");
    }
	
	
	@When("^user click approve approval terms and conditions$")
    public void user_click_approve_approval_terms_and_conditions() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
    }
	
	@When("^user click reject approval terms and conditions$")
    public void user_click_reject_approval_terms_and_conditions() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
    
	}@When("^user click propose to change data approval terms and conditions$")
    public void user_click_propose_to_change_data_approval_terms_and_conditions() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Propose to change data')]")).click();
    }
	
	@Then("^user see decide approval terms and conditions result$")
    public void user_see_decide_approval_terms_and_conditions_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideApprovalTermsAndConditionsResult.png"));
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        driver.close();
    }
}