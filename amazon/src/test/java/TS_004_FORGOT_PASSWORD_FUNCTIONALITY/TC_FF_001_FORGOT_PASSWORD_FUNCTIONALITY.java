package TS_004_FORGOT_PASSWORD_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_005_LOGIN_FUNCTIONALITY3;

public class TC_FF_001_FORGOT_PASSWORD_FUNCTIONALITY extends TC_LF_005_LOGIN_FUNCTIONALITY3 {
	@Test
	public void resetting_for_nonregistered_account() {

		TC_FF_001_FORGOT_PASSWORD_FUNCTIONALITY fpf001 = new TC_FF_001_FORGOT_PASSWORD_FUNCTIONALITY();
		fpf001.forgot_password_TC_LF_005();
		// enter mobile no
		driver.findElement(By.xpath(loc.getProperty("enter_phone_fpf001")))
				.sendKeys((loc.getProperty("enter_your_phone_fpf001")));
		// click continue
		driver.findElement(By.xpath(loc.getProperty("continue_fpf001"))).click();

	}
}
