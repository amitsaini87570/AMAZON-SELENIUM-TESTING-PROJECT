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

public class TC_SC_006_SHOPPINGCART_FUNCTIONALITY4 extends TC_SC_001_SHOPPINGCART_FUNCTIONALITY {
	@Test
	public void Validate_update_negative_Quantity_of_product() {

		TC_SC_006_SHOPPINGCART_FUNCTIONALITY4 atc_001 = new TC_SC_006_SHOPPINGCART_FUNCTIONALITY4();
		atc_001.success_message_to_shoppingCart();

	
		// validate update qty
		WebElement product_element_model = driver.findElement(By.xpath(loc.getProperty("qty_SC_004")));
		product_element_model.click();
		driver.findElement(By.xpath(loc.getProperty("qty_update_sc_005"))).click();
		//qty is not in negative or zero
		 
	}
}
