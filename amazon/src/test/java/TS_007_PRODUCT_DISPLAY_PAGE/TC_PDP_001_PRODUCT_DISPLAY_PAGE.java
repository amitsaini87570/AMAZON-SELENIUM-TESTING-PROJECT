package TS_007_PRODUCT_DISPLAY_PAGE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_PDP_001_PRODUCT_DISPLAY_PAGE extends TC_LF_001_LOGIN_FUNCTIONALITY {

	public void navigate_to_product_display_page() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

//login to application
		TC_PDP_001_PRODUCT_DISPLAY_PAGE display_pdp_001 = new TC_PDP_001_PRODUCT_DISPLAY_PAGE();
		display_pdp_001.logging_valid_credentials_TC_LF_001();

		// search box
		driver.findElement(By.xpath(loc.getProperty("search_boxPDP_001")))
				.sendKeys((loc.getProperty("product_namePDP_001")));
		// click on search box
		driver.findElement(By.xpath(loc.getProperty("search_buttonPDP_001"))).click();

		// scroll
		WebElement scroll = driver.findElement(By.xpath(loc.getProperty("scrool_add_to_caret_buttonTC_PDP_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		// click on add to cart
		driver.findElement(By.xpath(loc.getProperty("add_tocart_ButtonTC_PDP_001"))).click();
		// click on image product
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_0001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);

	}

	@Test
	public void validate_product_name_price() {

		TC_PDP_001_PRODUCT_DISPLAY_PAGE p_N_P001 = new TC_PDP_001_PRODUCT_DISPLAY_PAGE();
		p_N_P001.navigate_to_product_display_page();

		WebElement product_element = driver.findElement(By.xpath(loc.getProperty("product_name_xpathTC_PDP_001_")));
		String actual_product_namee = product_element.getText();
		String Expected_product_price = (loc.getProperty("expected_product_nameTC_PDP_001"));
		System.out.println("product name is ..." + actual_product_namee); //
		Assert.assertEquals(actual_product_namee, Expected_product_price, "name not matched");

		// validate product price
		WebElement product_element_price = driver.findElement(By.xpath(loc.getProperty("product_priceTC_PDP_001")));
		String actual_product_price = product_element_price.getText();
		String Expected_product_price11 = (loc.getProperty("expected_product_priceTC_PDP_001"));
		System.out.println("product price is ..." + actual_product_price); //
		Assert.assertEquals(actual_product_price, Expected_product_price11, "price not matched");

	}
}