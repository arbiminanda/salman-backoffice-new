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

public class customerAccountCustomerInfoNegative extends env_target {
	
	public String invalidPhone = "6282173621765321"; 

	@When("^user click button submit$")
    public void user_click_button_submit() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
    }
	
	@Then("^account data failed message is displayed$")
    public void account_data_failed_message_is_displayed() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Birth place field is required')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Birth date field is required')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Mother name field is required')]"))
        ));
    }
	
	@When("^user fill customer information except account name and number$")
    public void user_fill_customer_information_except_account_name_and_number() throws Throwable{
    	driver.findElement(By.xpath("//input[@name='birthPlace']")).sendKeys("Malang");
    	driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("17 July 1998");
    	driver.findElement(By.xpath("//input[@name='motherName']")).sendKeys("Ibu");
    	driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
    }
	
	@Then("^account failed message is displayed$")
    public void account_failed_message_is_displayed() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Salah satu form Main Account Number atau Account Name Wajib diisi')]"))
        ));
        driver.close();
    }
	
	@Then("^null number failed message is displayed$")
    public void null_number_failed_message_is_displayed() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Phone Number is required')]"))
        ));
    }
	
	@When("^user fill invalid format handphone number$")
    public void user_fill_invalid_format_handphone_number() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@name='newPhoneNumber']")).sendKeys(invalidPhone);
    }
	
	@Then("^invalid number failed message is displayed$")
    public void invalid_number_failed_message_is_displayed() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Phone Number is not valid')]"))
        ));
        driver.close();
    }
	
}