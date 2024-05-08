package TS_012_CHANGE_PASSWORD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_003_CHANGE_PASSWORD_FUNCTIONALITY3 extends TC_001_CHANGE_PASSWORD_FUNCTIONALITY {
	@Test
	public void validate_without_enter_change_password() {
		TC_003_CHANGE_PASSWORD_FUNCTIONALITY3 cp_001 = new TC_003_CHANGE_PASSWORD_FUNCTIONALITY3();
		cp_001.navigate_to_change_password_page();

		// save changes
		driver.findElement(By.xpath(loc.getProperty("click_on_save_changes_cp_002"))).click();

	}
}
