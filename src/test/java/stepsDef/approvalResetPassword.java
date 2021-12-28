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

public class approvalResetPassword extends env_target {
	
	@When("^user click reset password$")
    public void user_click_reset_password() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Reset Password')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
	
	@Then("^user see completed approval reset password$")
    public void user_see_completed_approval_reset_password() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\CompletedApprovalResetPassword.png"));
    }
	
	@Then("^user see pending approval reset password$")
    public void user_see_pending_approval_reset_password() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\PendingApprovalResetPassword.png"));
    }
	
	@When("^user search one account in completed approval reset password$")
    public void user_search_one_account_in_completed_approval_reset_password() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();	
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("Rojak Kholer");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchCompletedApprovalResetPassword.png"));
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();
    }
	
	@When("^user search one account in pending approval reset password$")
    public void user_search_one_account_in_pending_approval_reset_password() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("admin12223");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchPendingApprovalResetPassword.png"));
        driver.close();
    }
	
	@When("^user click reset approval reset password button$")
    public void user_click_reset_approval_reset_password_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'reset')]"))
        ));
    }
	
	@Then("^user see reset password result$")
    public void user_see_reset_password_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Password has been reset')]"))
        ));
    	wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DecideApprovalResetPasswordResult.png"));
    }
}