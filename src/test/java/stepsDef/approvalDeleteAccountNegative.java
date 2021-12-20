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

public class approvalDeleteAccountNegative extends env_target {
	
	@When("^user empty finance email$")
    public void user_empty_finance_email() throws Throwable {
        driver.findElement(By.xpath("//input[@name='email']")).clear();
    }
	
	@When("^user empty money out time$")
    public void user_empty_money_out_time() throws Throwable {
        driver.findElement(By.xpath("//input[@id='moneyOutDate']")).clear();
    }
	
	@Then("^user see three error messages$")
    public void user_see_three_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Supervisor comment is required')]"));
    	driver.findElement(By.xpath("//span[contains(text(),'email is not valid')]"));
    	driver.findElement(By.xpath("//span[contains(text(),'Date is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\AllErrorMsgApprovalDelete.png"));
    }
	
	@Then("^user see supervisor comment error message delete$")
    public void user_see_supervisor_comment_error_message_delete() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Supervisor comment is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ErrorMsgSupervisorCommentApprovalEKYC.png"));
    }
	
	@Then("^user see finance email error message$")
    public void user_see_finance_email_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'email is not valid')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ErrorMsgFinanceEmailApprovalDelete.png"));
    }
	
	@Then("^user see money out time error message$")
    public void user_see_money_out_time_error_message() throws Throwable{
		driver.findElement(By.xpath("//span[contains(text(),'Date is required')]"));
    	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\ErrorMsgMoneyOutTimeApprovalDelete.png"));
        driver.close();
    }
}