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

public class customerAccountPassedCustomer extends env_target {

	@When("^user navigates to Passed Customer Page$")
    public void user_navigate_to_Passed_Customer_Page() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Customer Account\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Passed Customer\")]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
    }
    
    @When("^user choose one of account and click Review$")
    public void user_choose_one_of_account_and_click_Review() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),\"Review\")]")).click();
        Thread.sleep(1000);
    }
    
    @When("^user enter comment$")
    public void user_enter_comment() throws Throwable {
        driver.findElement(By.id("note")).sendKeys("Comment");
    }
    
    @When("^user click Review button$")
    public void user_click_Review_button() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^user success Review$")
    public void user_success_Review() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='mb-2 Toast_notificationMessage__1Rf1w']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\reviewPassedCustomer.png"));
    	driver.close();
    }
    
    @When("^user trying to filtering Reviewed$")
    public void user_trying_to_filtering_Reviewed() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),\"Not Reviewed\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-true-option-0")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ReviewedPassedCustomerList.png"));
    }
    
    @When("^user trying to filter All Passed Customer$")
    public void user_trying_to_filter_All_Passed_Customer() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),\"Reviewed\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-true-option-2")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\AllPassedCustomerList.png"));
	}
    
    @When("^user search one account in Passed Customer$")
    public void user_search_one_account_in_Passed_Customer() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("onboarding baru 1");
        Thread.sleep(3000);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchAccPassedCustomer.png"));
		driver.close();
	}

}