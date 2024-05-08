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

public class TC_FF_003_FORGOT_PASSWORD_FUNCTIONALITY2 extends basetestamzn {

	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test
	public void different_password_confirm_placeholder() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signinTC_FF_002"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_noTC_FF_002")))
				.sendKeys((loc.getProperty("user_mobileTC_FF_002")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_forgot_password"))).click();
		driver.findElement(By.xpath(loc.getProperty("continue2"))).click();

		// get the otp using twilio api

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber12 = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber12);
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		// enter otp
		driver.findElement(By.xpath(loc.getProperty("otp_fieldTC_FF_002"))).sendKeys((loc.getProperty("OTPNumber12")));

		driver.findElement(By.xpath(loc.getProperty("click_on_continue_2"))).click();
		driver.findElement(By.xpath(loc.getProperty("new_password12")))
				.sendKeys((loc.getProperty("user_new_passwordTC_FF_002")));

		WebElement phnewpass = driver.findElement(By.xpath(loc.getProperty("new_password12")));
		String phnewpasstext = phnewpass.getAttribute("placeholder");
		System.out.println("new password placeholder text is = " + phnewpasstext);
		String ExpectednewpassText = "enter new password";
		Assert.assertEquals(phnewpasstext, ExpectednewpassText);

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
