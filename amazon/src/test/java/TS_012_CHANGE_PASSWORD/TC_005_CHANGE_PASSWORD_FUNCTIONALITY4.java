package TS_012_CHANGE_PASSWORD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_005_CHANGE_PASSWORD_FUNCTIONALITY4 extends TC_001_CHANGE_PASSWORD_FUNCTIONALITY {
	@Test
	public void validate_password_field_red_mark() {
		TC_005_CHANGE_PASSWORD_FUNCTIONALITY4 cp_001 = new TC_005_CHANGE_PASSWORD_FUNCTIONALITY4();
		cp_001.navigate_to_change_password_page();
		// no red mark field
		Assert.assertTrue(false);
	}
}
