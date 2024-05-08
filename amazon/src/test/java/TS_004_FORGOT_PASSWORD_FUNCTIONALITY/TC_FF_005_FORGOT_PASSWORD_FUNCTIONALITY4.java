package TS_004_FORGOT_PASSWORD_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;

import baseclass_amazon.basetestamzn;

public class TC_FF_005_FORGOT_PASSWORD_FUNCTIONALITY4 extends basetestamzn {

	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test
	public void url_title_confirm_password_page() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signinTC_FF_002"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_noTC_FF_002")))
				.sendKeys((loc.getProperty("user_mobileTC_FF_002")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_forgot_password"))).click();
		driver.findElement(By.xpath(loc.getProperty("continue2"))).click();

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber);
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		// enter otp
		driver.findElement(By.xpath(loc.getProperty("otp_fieldTC_FF_002"))).sendKeys((loc.getProperty("OTPNumber12")));

		driver.findElement(By.xpath(loc.getProperty("click_on_continue_2"))).click();

		// verify title
		// get the actual title
		String actual_titleFF_005 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_titleFF_005);
		// expected title from locator properties
		String expected_titlelFF_005 = (loc.getProperty("expected_title13"));
		// verifying the title
		Assert.assertEquals(actual_titleFF_005, expected_titlelFF_005, "title not matched");

		// verify url
		// get the actual url
		String actual_urlFF_005 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_urlFF_005);
		// expected url from locator properties
		String expected_urllFF_005 = (loc.getProperty("expected_url13"));
		// verifying the url
		Assert.assertEquals(actual_urlFF_005, expected_urllFF_005, "url not matched");

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
