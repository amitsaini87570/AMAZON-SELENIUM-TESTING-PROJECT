package TS_011CHECKOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_002_SHOPPINGCART_FUNCTIONALITY2;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_009_SHOPPINGCART_FUNCTIONALITY3;

public class TC_CO_005_CHECKOUT_FUNCTIONALITY5 extends TC_ATC_001_ADD_TO_CART_FUNCTIONALITY {
	@Test
	public void place_holder_address() {
		TC_CO_005_CHECKOUT_FUNCTIONALITY5 c_O_001 = new TC_CO_005_CHECKOUT_FUNCTIONALITY5();
		c_O_001.checkout_page();

		// only pincoad and landmark has place holder
		Assert.assertTrue(false);

	}
}
