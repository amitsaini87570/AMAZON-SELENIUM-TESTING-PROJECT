package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_007_LOGOUT_FUNCTIONALITY4 extends TC_LG_001_LOGOUT_FUNCTIONALITY {
	@Test
	public void logging_functionality_all_environment() {

		TC_LG_007_LOGOUT_FUNCTIONALITY4 logout5 = new TC_LG_007_LOGOUT_FUNCTIONALITY4();
		logout5.Logging_out();

		// 'Register Account' functionality is working in all the supported environments

	}
}