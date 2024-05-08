package TS_002_LOGIN_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;
import com.twilio.type.PhoneNumber;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import com.twilio.Twilio;

import baseclass_amazon.basetestamzn;

public class TC_LF_012_LOGIN_FUNCTIONALITY5 extends basetestamzn {

	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test
	public void forgot_password_TC_LF_012() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no12"))).sendKeys((loc.getProperty("user_mobile12")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_forgot_password"))).click();
		driver.findElement(By.xpath(loc.getProperty("continue2"))).click();

		// get the otp using twilio api Twilio.init(ACCOUNT_SID, AUTH_TOKEN); String

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber);
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		// enter otp
		driver.findElement(By.xpath(loc.getProperty("otp_field12"))).sendKeys((loc.getProperty("OTPNumber12")));

		// create your amazon account
		driver.findElement(By.xpath(loc.getProperty("create_amzn_accnt"))).click();

		driver.findElement(By.xpath(loc.getProperty("click_on_continue_2"))).click();
		driver.findElement(By.xpath(loc.getProperty("new_password12"))).sendKeys((loc.getProperty("user_mobile12")));
		driver.findElement(By.xpath(loc.getProperty("password_again12"))).sendKeys((loc.getProperty("user_mobile12")));
		driver.findElement(By.xpath(loc.getProperty("save_change_sign_in"))).click();

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
