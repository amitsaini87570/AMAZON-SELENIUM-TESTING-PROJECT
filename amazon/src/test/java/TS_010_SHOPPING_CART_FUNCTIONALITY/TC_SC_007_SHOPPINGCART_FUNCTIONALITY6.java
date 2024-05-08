package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_007_SHOPPINGCART_FUNCTIONALITY6 extends TC_SC_001_SHOPPINGCART_FUNCTIONALITY {
	@Test
	public void Validate_update_negative_qty_of_product() {

		TC_SC_007_SHOPPINGCART_FUNCTIONALITY6 atc_001 = new TC_SC_007_SHOPPINGCART_FUNCTIONALITY6();
		atc_001.success_message_to_shoppingCart();

		
	//delete the product
		driver.findElement(By.xpath(loc.getProperty("delete_sc_00007"))).click();

	}
}
