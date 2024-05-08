package TS_012_CHANGE_PASSWORD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_010_CHANGE_PASSWORD_FUNCTIONALITY5 extends TC_001_CHANGE_PASSWORD_FUNCTIONALITY {
	@Test
	public void environment_support_change_password() {
		TC_010_CHANGE_PASSWORD_FUNCTIONALITY5 cp_001 = new TC_010_CHANGE_PASSWORD_FUNCTIONALITY5();
		cp_001.navigate_to_change_password_page();

		// 'change password' functionality is working in all the supported environments

	}
}
