package TS_012_CHANGE_PASSWORD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_001_CHANGE_PASSWORD_FUNCTIONALITY extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void navigate_to_change_password_page() {

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
		// click on edit password
		driver.findElement(By.xpath(loc.getProperty("click_on_edit_password_cp_001"))).click();

	}
}
