package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_004_SHOPPINGCART_FUNCTIONALITY2 extends TC_SC_001_SHOPPINGCART_FUNCTIONALITY {
	@Test
	public void Validate_Name_Quantity_Unit_Price_Total_of_product() {

		TC_SC_004_SHOPPINGCART_FUNCTIONALITY2 atc_001 = new TC_SC_004_SHOPPINGCART_FUNCTIONALITY2();
		atc_001.success_message_to_shoppingCart();

		WebElement product_element = driver.findElement(By.xpath(loc.getProperty("product_name_xpathTC_TC_SC_0004")));
		String actual_product_namee = product_element.getText();
		String Expected_product_price = (loc.getProperty("expected_product_nameTC_TC_SC_004"));
		System.out.println("product name is ..." + actual_product_namee);
		 Assert.assertEquals(actual_product_namee, Expected_product_price, "name not matched");

		// validate product price
		WebElement product_element_price = driver.findElement(By.xpath(loc.getProperty("product_priceTC_TC_SC_004")));
		String actual_product_price = product_element_price.getText();
		String Expected_product_price11 = (loc.getProperty("expected_product_priceTC_TC_SC_004"));
		System.out.println("product price is ..." + actual_product_price);
		Assert.assertEquals(actual_product_price, Expected_product_price11, "price not matched");

		// validate product qty
		WebElement product_element_model = driver.findElement(By.xpath(loc.getProperty("qty_SC_004")));
		String actual_product_model = product_element_model.getText();
		System.out.println("product model is ..." + actual_product_model);
		String Expected_product_model = (loc.getProperty("expected_product_qty_SC_004"));
		Assert.assertEquals(actual_product_model, Expected_product_model, "model not matched");

	}
}
