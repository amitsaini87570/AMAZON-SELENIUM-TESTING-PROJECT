package TS_016_ORDER_INFORMATION;

import org.testng.annotations.Test;

import TS_015_ORDER_HISTORY.TS_015_003_ORDER_HISTORY3;

public class TS_OHI__016_002_ORDER_INFORMATION2 extends TS_015_003_ORDER_HISTORY3 {
	@Test
	public void validate_to_order_again() {
		TS_OHI__016_002_ORDER_INFORMATION2 tc_oh_001 = new TS_OHI__016_002_ORDER_INFORMATION2();
		tc_oh_001.order_DISPLAYED_002();

	}
}
