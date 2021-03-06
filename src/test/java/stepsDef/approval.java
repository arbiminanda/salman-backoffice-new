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

public class approval extends env_target {
	
	@When("^user click menu approval$")
    public void user_click_menu_approval() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Approval')]")).click();
    }
	
	@When("^user show approved approval$")
    public void user_show_approved_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Approved')]")).click();
    }
	
	@When("^user show pending approval$")
    public void user_show_pending_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Pending')]")).click();
    }
	
	@When("^user show completed approval$")
    public void user_show_completed_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Completed')]")).click();
    }
	
	@When("^user show waiting approval$")
    public void user_show_waiting_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Waiting')]")).click();
    }
	
	@When("^user show rejected approval$")
    public void user_show_rejected_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Rejected')]")).click();
    }
    
	@When("^user show force delete approval$")
    public void user_show_force_delete_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Force Delete')]")).click();
    }
	
	@When("^user show all approval$")
    public void user_show_all_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'All')]")).click();
    }
	
	@When("^user show submitted approval$")
    public void user_show_submitted_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Submitted')]")).click();
    }
	
	@When("^user show deleted approval$")
    public void user_show_deleted_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Deleted')]")).click();
    }
	
	@When("^user show active approval$")
    public void user_active_deleted_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Active')]")).click();
    }
	
	@When("^user show inactive approval$")
    public void user_inactive_deleted_approval() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Inactive')]")).click();
    }
	
	@When("^user click ok$")
    public void user_click_ok() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
    }
	
	@When("^user click cancel$")
    public void user_click_cancel() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
    }
	
	@When("^user empty search keyword field$")
    public void user_empty_search_keyword_field() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).clear();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
	}
	
	@When("^user fill supervisor comment$")
    public void user_fill_supervisor_comment() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='ekycAnalysis']")).sendKeys("Supervisor Comment");
    }
	
	@When("^user empty supervisor comment$")
    public void user_empty_supervisor_comment() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='ekycAnalysis']")).clear();
    }
	
}