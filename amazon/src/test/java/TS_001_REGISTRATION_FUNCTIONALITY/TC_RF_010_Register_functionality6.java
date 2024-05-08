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

public class TC_RF_010_Register_functionality6 extends basetestamzn {

	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test(priority = 10)
	public void Page_URL_Title_rf_010() {
		Reporter.log("tc_010_title_url_fields");

		driver.manage().window().maximize();
//mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
//click on start hare		
		driver.findElement(By.xpath(loc.getProperty("click_on_start_hare"))).click();

//verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title10"));
		// verifying the title
		Assert.assertEquals(actual_title10, expected_title10, "title not matched");

//verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url10"));
		// verifying the url
		 Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}
}
