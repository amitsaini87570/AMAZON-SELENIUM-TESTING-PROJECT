package TS_017_RETURN_ORDER;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_016_ORDER_INFORMATION.TS_OHI__016_003_ORDER_INFORMATION3;

public class TC_006_RETURN_ORDER2 extends TS_OHI__016_003_ORDER_INFORMATION3 {
	@Test
	public void supported_env() {

		TS_OHI__016_003_ORDER_INFORMATION3 tc_oh_001 = new TS_OHI__016_003_ORDER_INFORMATION3();
		tc_oh_001.validate_to_return_order();
		// 'product_return' functionality is working in all the supported environments

	}
}
