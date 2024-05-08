package TS_001_REGISTRATION_FUNCTIONALITY;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;
import com.twilio.type.PhoneNumber;

import baseclass_amazon.basetestamzn;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class TC_RF_008_Register_functionality5 extends basetestamzn {

	@Test(priority = 8)
	public void Password_Complexity_rf_tc_008() {
		Reporter.log("tc_0008_complixity_password_fields");

		driver.manage().window().maximize();
//mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
//click on start hare		
		driver.findElement(By.xpath(loc.getProperty("click_on_start_hare"))).click();
//name
		driver.findElement(By.xpath(loc.getProperty("your_name"))).sendKeys((loc.getProperty("name8")));
//click on country code		
		driver.findElement(By.xpath("//*[@id=\"auth-country-picker-container\"]/span/span/span")).click();
//click on country	    
		driver.findElement(By.xpath("//*[@id=\"auth-country-picker_216\"]")).click();
//mobile
		driver.findElement(By.xpath(loc.getProperty("mobile_no1100011"))).sendKeys((loc.getProperty("mobile8")));
//password
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys((loc.getProperty("password8")));

//verify mobile no	
		driver.findElement(By.xpath(loc.getProperty("verify_mobile_no"))).click();
		String Actual_w_m = driver.findElement(By.xpath(loc.getProperty("warning_message_xpath"))).getText();
		String Expected_w_m = "Passwords must be at least 6 characters.";
		Assert.assertEquals(Actual_w_m, Expected_w_m);
	}
}
