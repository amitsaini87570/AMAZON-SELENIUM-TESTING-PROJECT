package TS_013_MY_ACCOUNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_002_LOGIN_FUNCTIONALITY2;
import TS_011CHECKOUT_FUNCTIONALITY.TC_CO_003_CHECKOUT_FUNCTIONALITY3;

public class TC_MA_002_MY_ACCOUNT2 extends TC_LF_002_LOGIN_FUNCTIONALITY2 {
	@Test
	public void navigate_tologin_from_my_account() {
		TC_MA_002_MY_ACCOUNT2 m_a_001 = new TC_MA_002_MY_ACCOUNT2();
		m_a_001.logging_invalid_credentials_TC_LF_002();

		// login with your account click

	}

}
