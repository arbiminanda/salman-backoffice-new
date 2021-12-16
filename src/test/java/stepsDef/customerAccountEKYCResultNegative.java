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

public class customerAccountEKYCResultNegative extends env_target {
	
	public String newPhone = "6281348206549"; 

	@When("^user empty ekyc analysis$")
    public void user_empty_ekyc_analysis() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='ekycAnalysis']")).clear();
    }
    
    @Then("^user see analysis error message$")
    public void user_see_analysis_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Analisis wajib diisi')]"));
    }
    
    @Then("^user see recommendation error message$")
    public void user_see_recommendation_error_message() throws Throwable{
    	driver.findElement(By.xpath("//span[contains(text(),'Rekomendasi wajib diisi')]"));
    }
    
}