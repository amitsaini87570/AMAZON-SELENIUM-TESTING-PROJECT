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

public class TC_RF_005_Register_functionality4 extends basetestamzn {

	@Test(priority = 5)
	public void have_proper_placeholders_tc_rf_005() {
		Reporter.log("tc_0005_placeholder_mandatory_fields");

		driver.manage().window().maximize();
//mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
//click on start hare		
		driver.findElement(By.xpath(loc.getProperty("click_on_start_hare"))).click();
//fields have proper placeholder

	}
}
