package TS_014_MY_ACCOUNT_INFORMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_012_CHANGE_PASSWORD.TC_001_CHANGE_PASSWORD_FUNCTIONALITY;

public class TC_MAI_002_MY_ACCOUNT_INFORMATION2 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void my_account_to_my_account_info() {
		TC_001_CHANGE_PASSWORD_FUNCTIONALITY cp_001 = new TC_001_CHANGE_PASSWORD_FUNCTIONALITY();
		cp_001.logging_valid_credentials_TC_LF_001();

		driver.manage().window().maximize();
		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover_cp_001")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
		// click on my account
		driver.findElement(By.xpath(loc.getProperty("click_on_your_account_cp_001"))).click();

		// click on login and security
		driver.findElement(By.xpath(loc.getProperty("click_on_login_security_cp_001"))).click();

	}

}
