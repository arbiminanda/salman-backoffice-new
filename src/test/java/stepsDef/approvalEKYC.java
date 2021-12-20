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

public class approvalEKYC extends env_target {
	
	@When("^user click ekyc$")
    public void user_click_ekyc() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'e-KYC')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@When("^user search one account in approval ekyc$")
    public void user_search_one_account_in_approval_ekyc() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("test tengah mambu");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchApprovalEKYC.png"));
        driver.close();
    }
	
	@When("^user click decide approval button$")
    public void user_click_decide_approval_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'e-KYC Approval')]"))
        ));
    }
	
	
	@When("^user show dropdown action approval ekyc$")
    public void user_show_dropdown_action_approval_ekyc() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Choose actions')]")).click();
    }
	
	@When("^user choose approve action$")
    public void user_choose_approve_action() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Approve')]")).click();
    }
	
	@When("^user choose reject action$")
    public void user_choose_reject_action() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Reject')]")).click();
    }
	
	@When("^user choose propose to change data action$")
    public void user_choose_propose_to_change_data_action() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Propose to change data')]")).click();
    }
	
	@When("^user click confirm approval$")
    public void user_click_confirm_approval() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
	
	@Then("^user see approval ekyc result$")
    public void user_see_approval_ekyc_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your approval ekyc has been submitted')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideEKYCResult.png"));
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        driver.close();
    }
	
}