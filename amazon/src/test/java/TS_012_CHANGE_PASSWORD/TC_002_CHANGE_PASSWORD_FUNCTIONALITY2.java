package TS_012_CHANGE_PASSWORD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_002_CHANGE_PASSWORD_FUNCTIONALITY2 extends TC_001_CHANGE_PASSWORD_FUNCTIONALITY {
	@Test
	public void validate_change_password() {
		TC_002_CHANGE_PASSWORD_FUNCTIONALITY2 cp_001 = new TC_002_CHANGE_PASSWORD_FUNCTIONALITY2();
		cp_001.navigate_to_change_password_page();

		// current password
		driver.findElement(By.xpath(loc.getProperty("current_password_cp_002")))
				.sendKeys((loc.getProperty("enter_current_password_cp_002")));
		// new password
		driver.findElement(By.xpath(loc.getProperty("new_password_cp_002")))
				.sendKeys((loc.getProperty("enter_new_password_cp_002")));

		// re enter new password
		driver.findElement(By.xpath(loc.getProperty("re_enter_new_password_cp_002")))
				.sendKeys((loc.getProperty("Re_enter_enter_new_password_cp_002")));

		// save changes
		driver.findElement(By.xpath(loc.getProperty("click_on_save_changes_cp_002"))).click();

	}
}
