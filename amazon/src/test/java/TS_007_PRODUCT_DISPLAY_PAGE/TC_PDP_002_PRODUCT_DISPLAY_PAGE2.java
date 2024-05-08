package TS_007_PRODUCT_DISPLAY_PAGE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_PDP_002_PRODUCT_DISPLAY_PAGE2 extends TC_LF_001_LOGIN_FUNCTIONALITY {

	public void navigate_to_product_display_page() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

//login to application
		TC_PDP_002_PRODUCT_DISPLAY_PAGE2 display_pdp_001 = new TC_PDP_002_PRODUCT_DISPLAY_PAGE2();
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
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);

		// again scroll
		WebElement scroll2 = driver.findElement(By.xpath(loc.getProperty("colour_scroll_elementPDP_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll2);
	}

	@Test
	public void validate_product_colour_size_brand_model_os_technology() {

		TC_PDP_002_PRODUCT_DISPLAY_PAGE2 TC_PDP002 = new TC_PDP_002_PRODUCT_DISPLAY_PAGE2();
		TC_PDP002.navigate_to_product_display_page();

		// validate product colour
		WebElement product_element_colour = driver
				.findElement(By.xpath(loc.getProperty("mobile_colour_buttonPDP_001")));
		String actual_product_colour = product_element_colour.getText();
		String Expected_product_price = loc.getProperty("expected_product_colourPDP_001");
		System.out.println("product colour is ..." + actual_product_colour);
		Assert.assertEquals(actual_product_colour, Expected_product_price, "colour not matched");

		// validate product size(unable to locate mobile size element

		WebElement product_element_size = driver.findElement(By.xpath(loc.getProperty("mobile_sizePDP_001")));
		String actual_product_size = product_element_size.getText();
		System.out.println("product size is ..." + actual_product_size);
		String Expected_product_size = (loc.getProperty("expected_product_sizePDP_001"));
		Assert.assertEquals(actual_product_size, Expected_product_size, "size not matched");

		// validate product brand name

		WebElement product_element_brand = driver.findElement(By.xpath(loc.getProperty("brand_namePDP_001")));
		String actual_product_brand = product_element_brand.getText();
		System.out.println("product  brand  is ..." + actual_product_brand);
		String Expected_product_brand = loc.getProperty("expected_product_brandPDP_001");
		Assert.assertEquals(actual_product_brand, Expected_product_brand, "brand not matched");

		// validate product model

		WebElement product_element_model = driver.findElement(By.xpath(loc.getProperty("model_noPDP_001")));
		String actual_product_model = product_element_model.getText();
		System.out.println("product model is ..." + actual_product_model);
		String Expected_product_model = (loc.getProperty("expected_product_modelPDP_001"));
		Assert.assertEquals(actual_product_model, Expected_product_model, "model not matched");

		// validate product os

		WebElement product_element_os = driver.findElement(By.xpath(loc.getProperty("operating_systemPDP_001")));
		String actual_product_os = product_element_os.getText();
		System.out.println("product os is ..." + actual_product_os);
		String Expected_product_os = ((loc.getProperty("expected_product_osPDP_001")));
		Assert.assertEquals(actual_product_os, Expected_product_os, "os not matched");

		// validate product Cellular_Technology name

		WebElement product_element_tech = driver.findElement(By.xpath(loc.getProperty("Cellular_TechnologyPDP_001")));
		String actual_product_tech = product_element_tech.getText();
		System.out.println("product os is ..." + actual_product_tech);
		String Expected_product_tech = (loc.getProperty("expected_product_techPDP_001"));
		Assert.assertEquals(actual_product_tech, Expected_product_tech, "tech not matched");

	}
}