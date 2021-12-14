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

public class customerAccountCustomerInfo extends env_target {

	@When("^user navigates Customer Information Dashboard Page$")
    public void user_navigates_Customer_Information_Dashboard_Page() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Customer Account\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Customer Information\")]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='customerName']"))
        ));
    }
    
    @When("^user select Account type to Both$")
    public void user_select_Account_type_to_Both() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),\"Choose account type\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),\"Both\")]")).click();
    }

    @Then("^user fill all customer information$")
    public void user_fill_all_customer_information() throws Throwable{
    	driver.findElement(By.xpath("//input[@name='accountNumber']")).sendKeys("110100002987");
    	driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("User dev 30");
    	driver.findElement(By.xpath("//input[@name='birthPlace']")).sendKeys("Malang");
    	driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("17 July 1998");
    	driver.findElement(By.xpath("//input[@name='motherName']")).sendKeys("Ibu");
    	driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
    }
    
}