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

public class approvalDeleteAccount extends env_target {
	
	@When("^user click delete account$")
    public void user_click_delete_account() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Delete Account')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@When("^user search one account in deleted approval delete$")
    public void user_search_one_account_in_deleted_approval_delete() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("akun gmail");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchDeletedApprovalDelete.png"));
    }
	
	@When("^user search one account in pending approval delete$")
    public void user_search_one_account_in_pending_approval_delete() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("Angeline ZUper Buttercup");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchPendingApprovalDelete.png"));
        driver.close();
    }
	
	@When("^user click decide approval delete button$")
    public void user_click_decide_approval_delete_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Delete Account Approval')]"))
        ));
    }
	
	@When("^user fill finance email$")
    public void user_fill_finance_email() throws Throwable {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tes@gmail.com");
    }
	
	@When("^user fill money out time$")
    public void user_fill_money_out_time() throws Throwable {
        driver.findElement(By.xpath("//input[@id='moneyOutDate']")).sendKeys("14 December 2030");
    }
	
	@When("^user click confirm delete approval$")
    public void user_click_confirm_delete_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Confirm Delete')]")).click();
    }
	
	@When("^user click reject delete approval$")
    public void user_click_reject_delete_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
    }
	
	@Then("^user see approval delete result$")
    public void user_see_approval_delete_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your approval ekyc has been submitted')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideApprovalDeleteResult.png"));
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        driver.close();
    }
}