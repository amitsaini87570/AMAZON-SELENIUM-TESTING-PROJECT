package TS_015_ORDER_HISTORY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TS_015_004_ORDER_HISTORY4 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void order_DISPLAYED_002() {
		TS_015_004_ORDER_HISTORY4 tc_oh_001 = new TS_015_004_ORDER_HISTORY4();
		tc_oh_001.logging_valid_credentials_TC_LF_001();
		driver.findElement(By.xpath(loc.getProperty("click_on_order_history_oh_001"))).click();

		// CLICK ON OREDER TRACK
		driver.findElement(By.xpath(loc.getProperty("click_on_order_track_oh_003"))).click();

	}

}
