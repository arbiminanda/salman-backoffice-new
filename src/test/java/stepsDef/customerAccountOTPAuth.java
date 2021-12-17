package stepsDef;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class customerAccountOTPAuth extends env_target {

	@When("^user click menu customer account$")
    public void user_click_menu_customer_account() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Customer Account')]")).click();
    }
	
	@When("^user click otp auth$")
    public void user_click_otp_auth() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'OTP Authentication')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-username"))
        ));
    }
    
    @When("^user show done otp auth$")
    public void user_show_done_otp_auth() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Waiting')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Done')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-username"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DoneOTPAuthList.png"));
    }
    
    @When("^user search one account in done otp auth$")
    public void user_search_one_account_in_done_otp_auth() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("selfieaja");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-username"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchDoneOTPAuth.png"));
        driver.close();
    }
    
    @When("^user show waiting otp auth$")
    public void user_show_waiting_otp_auth() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Done')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Waiting')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-username"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DoneOTPAuthList.png"));
    }
    
    @When("^user click generate otp button$")
    public void user_click_generate_otp_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Generate OTP')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }
    
    @Then("^user success generate otp$")
    public void user_success_generate_otp() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='mb-2 Toast_notificationMessage__1Rf1w']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\GenerateOTP.png"));
    }
    
    @When("^user search one account in waiting otp auth$")
    public void user_search_one_account_in_waiting_otp_auth() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("userdev61");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.id("column-username"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchWaitingOTPAuth.png"));
        driver.close();
	}

}