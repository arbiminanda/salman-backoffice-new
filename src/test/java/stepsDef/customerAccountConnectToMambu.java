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

public class customerAccountConnectToMambu extends env_target {

	@When("^user navigate to Connect to Mambu Page$")
    public void user_navigate_to_Connect_to_Mambu_Page() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Customer Account\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Connect to Mambu\")]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
    }
    
    @When("^user choose one of account and click Retry$")
    public void user_choose_one_of_account_and_click_Retry() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),\"Retry\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),\"OK\")]")).click();
    }

    @Then("^user success Retry$")
    public void user_success_Retry() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='mb-2 Toast_notificationMessage__1Rf1w']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\retryConnectToMambu.png"));
    	driver.close();
    }
    
    @When("^user trying to filter Connected$")
    public void user_trying_to_filter_Connected() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),\"Not Connected\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-true-option-0")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ConnectedToMambuList.png"));
    }
    
    @When("^user trying to filter All Mambu Status$")
    public void user_trying_to_filter_All_Mambu_Status() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),\"Connected\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-true-option-2")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\AllConnectToMambuList.png"));
		driver.close();
	}

}