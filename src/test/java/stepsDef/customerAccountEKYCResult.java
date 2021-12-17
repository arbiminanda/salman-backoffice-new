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

public class customerAccountEKYCResult extends env_target {
	
	@When("^user click ekyc result$")
    public void user_click_verifications() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'e-KYC Result')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
    }
	
	@When("^user show submitted ekyc result$")
    public void user_show_submitted_ekyc_result() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Approved')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Submitted')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SubmittedEKYCList.png"));
    }
	
	@When("^user show approved ekyc result$")
    public void user_show_approved_ekyc_result() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Submitted')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Approved')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ApprovedEKYCList.png"));
    }
    
	@When("^user show force delete ekyc result$")
    public void user_show_force_delete_ekyc_result() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Approved')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Force Delete')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.id("column-name"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ForceDeleteEKYCList.png"));
        driver.close();
    }
	
	@When("^user show rejected ekyc result$")
    public void user_show_rejected_ekyc_result() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Force Delete')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Rejected')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\RejectedEKYCList.png"));
    }
	
	@When("^user show pending ekyc result$")
    public void user_show_pending_ekyc_result() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Approved')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Pending')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\PendingEKYCList.png"));
    }
	
	@When("^user show waiting ekyc result$")
    public void user_show_waiting_ekyc_result() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Approved')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Waiting')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\WaitingEKYCList.png"));
    }
	
	@When("^user show all ekyc result$")
    public void user_show_all_ekyc_result() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Approve')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'All')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\AllEKYCList.png"));
    }
	
    @When("^user click decide button$")
    public void user_click_decide_button() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Decide')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'EKYC Result')]"))
        ));
    }
    
    @When("^user check selfie with KTP photo$")
    public void user_check_selfie_with_KTP_photo() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Selfie with KTP')]")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\CheckSelfieWithKTP.png"));
    }
    
    @When("^user check KTP photo$")
    public void user_check_KTP_photo() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'KTP')]")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\CheckKTP.png"));
    }
    
    @When("^user check selfie photo$")
    public void user_check_selfie_photo() throws Throwable {
        driver.findElement(By.xpath("//button[@id='headlessui-tabs-tab-46']")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\CheckSelfie.png"));
    }
    
    @When("^user check signature photo$")
    public void user_check_signature_photo() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Signature')]")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\CheckSignature.png"));
    }
    
    @When("^user fill ekyc analysis$")
    public void user_fill_ekyc_analysis() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='ekycAnalysis']")).sendKeys("EKYC Analysis");
    }
    
    @When("^user fill recommendation$")
    public void user_fill_recommendation() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='recommendation']")).sendKeys("Recommendation");
    }
    
    @When("^user click reject button$")
    public void user_click_reject_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Reject')]")).click();
    }
    
    @Then("^user see reject result$")
    public void user_see_reject_result() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.className("mb-2 Toast_notificationMessage__1Rf1w"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\RejectEKYCResult.png"));
        if (driver.findElements(By.xpath("//div[contains(text(),'EKYC Result')]")).size() != 0) {
    		driver.findElement(By.xpath("//button[@class='font-bold flex items-center mt-8 focus:outline-none']")).click();
    	}
    }
    
    @When("^user click approve button$")
    public void user_click_approve_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
    }
    
    @Then("^user see approve result$")
    public void user_see_approve_result() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.className("mb-2 Toast_notificationMessage__1Rf1w"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ApproveEKYCResult.png"));
        driver.close();
    }
    
    @When("^user click propose change data button$")
    public void user_click_propose_change_data_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Propose to change data')]")).click();
    }
    
    @When("^user click force delete button$")
    public void user_click_force_delete_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Force Delete')]")).click();
        driver.findElement(By.xpath("//textarea[@name='adminReasonDelete']")).sendKeys("Reason");
        List<WebElement> foundElements = driver.findElements(By.xpath("//button[contains(text(),'Force Delete')]"));
        foundElements.get(foundElements.size()-1).click();
    }
    
    @When("^user click img filter button$")
    public void user_click_img_filter_button() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@src='/icons/filter.png']")).click();
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Filter')]"))
        ));
    }
      
    @When("^user fill start date for ekyc filter$")
    public void user_fill_start_date_for_ekyc_filter() throws Throwable {
    	driver.findElement(By.xpath("//input[@id='dateFrom']")).sendKeys("1 October 2021");
    }
    
    @When("^user fill end date for ekyc filter$")
    public void user_fill_end_date_for_ekyc_filter() throws Throwable {
    	driver.findElement(By.xpath("//input[@id='dateTo']")).sendKeys("1 December 2021");
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\FilterEKYCResult.png"));
    }
    
    @When("^user click proceed button in filter$")
    public void user_click_proceed_button_in_filter() throws Throwable {
    	driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
    }
    
    @Then("^user see filter result$")
    public void user_see_filter_result() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
    }
    
    @When("^user search one account in ekyc_result$")
    public void user_search_one_account_in_ekyc_result() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search here..']")).sendKeys("user dev 78");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Loading')]"))
        ));
        wait.until(ExpectedConditions.or(
        	ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\SearchEKYCResult.png"));
        driver.close();
    }
    
}