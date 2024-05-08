package TS_004_FORGOT_PASSWORD_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.twilio.Twilio;

import baseclass_amazon.basetestamzn;

public class TC_FF_008_FORGOT_PASSWORD_FUNCTIONALITY7 extends basetestamzn {
	
	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test
	public void mobile_no_placeholder() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signinTC_FF_002"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_noTC_FF_002"))).sendKeys((loc.getProperty("user_mobileTC_FF_002")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_forgot_password"))).click();
		driver.findElement(By.xpath(loc.getProperty("clear_mobilenoff007"))).clear();
		
		WebElement phmobile = driver.findElement(By.xpath(loc.getProperty("clear_mobilenoff007")));
		String phmobiletextff08 = phmobile.getAttribute("placeholder");
		System.out.println("name placeholder text is = " + phmobiletextff08);
		String ExpectedmobileTextff008 = "enter email or phone no";
		 Assert.assertEquals(phmobiletextff08,ExpectedmobileTextff008);
		//no placeholders are present
		



	}
}
