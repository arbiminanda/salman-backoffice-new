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
	
	public String newPhone = "6281348206549"; 

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

    @When("^user fill all customer information$")
    public void user_fill_all_customer_information() throws Throwable{
    	driver.findElement(By.xpath("//input[@name='accountNumber']")).sendKeys("110100002987");
    	driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("User dev 30");
    	driver.findElement(By.xpath("//input[@name='birthPlace']")).sendKeys("Malang");
    	driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("17 July 1998");
    	driver.findElement(By.xpath("//input[@name='motherName']")).sendKeys("Ibu");
    	driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
    }
    
    @When("^user click button detail$")
    public void user_click_button_detail() throws Throwable {
        driver.findElement(By.linkText("Detail")).click();
        Thread.sleep(1000);
    }
    
    @Then("^user is on Customer Information Detail Page$")
    public void user_is_on_Customer_Information_Detail_Page() throws Throwable{
    	driver.findElement(By.xpath("//div[contains(text(),'Customer Information Detail')]"));
    	driver.close();
    }
    
    @When("^user trying to filter transaction record feature$")
    public void user_trying_to_filter_transaction_record_feature() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//img[@src='/icons/filter.png']")).click();
        Thread.sleep(1000);
    }
      
    @When("^user fill some infomation on filter feature$")
    public void user_fill_some_infomation_on_filter_feature() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Transfer In')]")).click();
        driver.findElement(By.id("startDate")).sendKeys("1 October 2021");
        driver.findElement(By.id("endDate")).sendKeys("1 December 2021");
        driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
    }
    
    @Then("^user success filtering transaction record$")
    public void user_success_filtering_transaction_record() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'ID')]"))
        ));
        driver.close();
    }
    
    @When("^user click button Change box account number$")
    public void user_click_button_Change_box_account_number() throws Throwable {
        Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[3]/div[2]/div/div[2]/div[1]/div[6]/span[2]/button")).click();
    }
    
    @When("^user choose one of box account$")
    public void user_choose_one_of_box_account() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Box Account Number')]"))
        ));
        driver.findElement(By.xpath("//p[contains(text(),'Main Box')]")).click();
    }
    
    @When("^user click Proceed button$")
    public void user_click_Proceed_button() throws Throwable {
    	driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
    }
    
    @Then("^user see all data on chosen box account$")
    public void user_see_all_data_on_chosen_box_account() throws Throwable{
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'ID')]"))
        ));
        driver.close();
    }
    
    @When("^user click Change handphone number button$")
    public void user_click_Change_handphone_number_button() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[3]/div[2]/div/div[2]/div[1]/div[10]/span[2]/button")).click();
    }
    
    @When("^user fill new handphone number$")
    public void user_fill_new_handphone_number() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@name='newPhoneNumber']")).sendKeys(newPhone);
    }
    
    @When("^user click Save Change button$")
    public void user_click_Save_Change_button() throws Throwable {
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("^user success change handphone number$")
    public void user_success_change_handphone_number() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.or(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'" + newPhone + "')]"))
        ));
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\NewPhoneNumber.png"));
        driver.close();
    }
    
    @When("^user click download transaction log button$")
    public void user_click_download_transaction_log_button() throws Throwable {
    	driver.findElement(By.xpath("//button[@class='focus:outline-none border rounded-lg p-2 px-5 mx-1 bg-white shadow-sm focus:ring-2 focus:ring-alami-green focus:ring-opacity-50 text-sm font-normal']")).click();
    }
    
    @When("^user choose format file$")
    public void user_choose_format_file() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'PDF')]']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Download')]")).click();
    }
    
    @When("^user click Download button$")
    public void user_click_Download_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Download')]")).click();
    }
    
    @Then("^user success download log$")
    public void user_success_download_log() throws Throwable {
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\DownloadTransLog.png"));
		driver.close();
    }
    
}