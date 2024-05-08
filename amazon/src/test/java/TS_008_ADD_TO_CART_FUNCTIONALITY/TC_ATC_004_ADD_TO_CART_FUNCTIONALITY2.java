package TS_008_ADD_TO_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;

public class TC_ATC_004_ADD_TO_CART_FUNCTIONALITY2 extends TC_PDP_001_PRODUCT_DISPLAY_PAGE {

	public void display_page() {

		// login to application
		TC_PDP_001_PRODUCT_DISPLAY_PAGE display_pdp_001 = new TC_PDP_001_PRODUCT_DISPLAY_PAGE();
		display_pdp_001.logging_valid_credentials_TC_LF_001();

		// search box
		driver.findElement(By.xpath(loc.getProperty("search_boxPDP_001")))
				.sendKeys((loc.getProperty("product_namePDP_001")));
		// click on search box
		driver.findElement(By.xpath(loc.getProperty("search_buttonPDP_001"))).click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// scroll
		WebElement scroll = driver.findElement(By.xpath(loc.getProperty("scrool_add_to_caret_buttonTC_PDP_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
	}

	public void click_on_addtocart() {
		TC_ATC_004_ADD_TO_CART_FUNCTIONALITY2 atc_001 = new TC_ATC_004_ADD_TO_CART_FUNCTIONALITY2();
		atc_001.display_page();

		// click on add to cart
		driver.findElement(By.xpath(loc.getProperty("add_tocart_ButtonTC_PDP_001"))).click();

		// click on image product
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);

		// go to cart
		driver.findElement(By.xpath(loc.getProperty("go_to_cart_buttonnATC_001"))).click();

		// proceed to buy
		driver.findElement(By.xpath(loc.getProperty("proceed_to_buy"))).click();
	}

	@Test
	public void validate_ui() {

		TC_ATC_004_ADD_TO_CART_FUNCTIONALITY2 atc_0001 = new TC_ATC_004_ADD_TO_CART_FUNCTIONALITY2();
		atc_0001.click_on_addtocart();

		// change address
		driver.findElement(By.xpath(loc.getProperty("click_on_change_atc_001"))).click();

		// add new address
		driver.findElement(By.xpath(loc.getProperty("add_new_add"))).click();

		// filling address details
		driver.findElement(By.xpath(loc.getProperty("full_name_delivery"))).sendKeys((loc.getProperty("usernamee")));
		driver.findElement(By.xpath(loc.getProperty("mobile_no_delivery"))).sendKeys((loc.getProperty("mobile_no")));
		driver.findElement(By.xpath(loc.getProperty("pin_code"))).sendKeys((loc.getProperty("your_pin")));
		driver.findElement(By.xpath(loc.getProperty("house_no"))).sendKeys((loc.getProperty("your_house_no")));
		driver.findElement(By.xpath(loc.getProperty("street"))).sendKeys((loc.getProperty("your_street")));
		driver.findElement(By.xpath(loc.getProperty("land_mark"))).sendKeys((loc.getProperty("your_land_mark")));

		// driver.findElement(By.xpath(loc.getProperty("city"))).sendKeys((loc.getProperty("your_city")));
		// driver.findElement(By.xpath(loc.getProperty("state"))).sendKeys((loc.getProperty("your_state")));

		// MAKE DEFOULT ADDRESS
		driver.findElement(By.xpath(loc.getProperty("make_default_add"))).click();
		// use this address
		driver.findElement(By.xpath(loc.getProperty("use_this_add"))).click();
		// use this payment method
		driver.findElement(By.xpath(loc.getProperty("use_this_payment_method"))).click();
		// place_your_order
		driver.findElement(By.xpath(loc.getProperty("place_your_order"))).click();

		// Proper and good UI are displayed on the 'Register Account' page

	}

}
