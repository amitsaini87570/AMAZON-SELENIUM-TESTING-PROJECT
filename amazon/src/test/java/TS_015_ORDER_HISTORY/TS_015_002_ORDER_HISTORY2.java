package TS_015_ORDER_HISTORY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TS_015_002_ORDER_HISTORY2 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void order_DISPLAYED_002() {
		TS_015_002_ORDER_HISTORY2 tc_oh_001 = new TS_015_002_ORDER_HISTORY2();
		tc_oh_001.logging_valid_credentials_TC_LF_001();
		driver.findElement(By.xpath(loc.getProperty("click_on_order_history_oh_001"))).click();

	}

}
