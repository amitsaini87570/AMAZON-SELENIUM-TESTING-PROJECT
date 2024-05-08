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
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class TC_RF_001_Register_functionality extends basetestamzn {

	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test(priority = 1)
	public void Registering_Account_providing__Mandatory_fields_rf_001() {
		Reporter.log("tc_0001_provide_mandatory_fields");
		driver.manage().window().maximize();
//mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
//click on start hare		
		driver.findElement(By.xpath(loc.getProperty("click_on_start_hare"))).click();
//name
		driver.findElement(By.xpath(loc.getProperty("your_name"))).sendKeys((loc.getProperty("name1")));
//click on country code		
		driver.findElement(By.xpath("//*[@id=\"auth-country-picker-container\"]/span/span/span")).click();
//click on copuntry	    
		driver.findElement(By.xpath("//*[@id=\"auth-country-picker_216\"]")).click();
//mobile
		driver.findElement(By.xpath(loc.getProperty("mobile_no11000"))).sendKeys((loc.getProperty("mobile1")));
//password
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys((loc.getProperty("password1")));
//verify mobile no	
		driver.findElement(By.xpath(loc.getProperty("verify_mobile_no"))).click();

		// get the otp using twilio api

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber);
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		// enter otp
		driver.findElement(By.xpath(loc.getProperty("enterss_otp"))).sendKeys("OTPNumber");

		// create your amazon account
		driver.findElement(By.xpath(loc.getProperty("create_amzn_accnt"))).click();

	}

	public static String getMessage() {
		return ((java.util.stream.Stream<Message>) getMessages())
				.filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals("+13357493746")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}

	private static Stream getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return (Stream) StreamSupport.stream(messages.spliterator(), false);

	}

}
