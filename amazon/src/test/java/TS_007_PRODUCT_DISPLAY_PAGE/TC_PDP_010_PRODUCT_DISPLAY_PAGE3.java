package TS_007_PRODUCT_DISPLAY_PAGE;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_PDP_010_PRODUCT_DISPLAY_PAGE3 extends TC_LF_001_LOGIN_FUNCTIONALITY {
@Test
	public void validate_product_write_review() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

        //login to application
		TC_PDP_010_PRODUCT_DISPLAY_PAGE3 display_pdp_001 = new TC_PDP_010_PRODUCT_DISPLAY_PAGE3();
		display_pdp_001.logging_valid_credentials_TC_LF_001();

		// search box
		driver.findElement(By.xpath(loc.getProperty("search_boxPDP_001"))).sendKeys((loc.getProperty("product_namePDP_001")));
		
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

		// again scroll
		 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

		WebElement scroll2 = driver.findElement(By.xpath(loc.getProperty("scroll_review_pdp_010")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll2);
		

		driver.findElement(By.xpath(loc.getProperty("write_product_review_TC_PDP_010"))).click();

		// again scroll
		WebElement scroll3 = driver.findElement(By.xpath(loc.getProperty("SCROOL_TO_SUBMIT_TC_PDP_010")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll3);

		driver.findElement(By.xpath(loc.getProperty("WRITE_REVIEW_IN_BOX_TC_PDP_010")))
				.sendKeys((loc.getProperty("product_review_pdp_010")));

		driver.findElement(By.xpath(loc.getProperty("SCROOL_TO_SUBMIT_TC_PDP_010"))).click();
		
		
		
	}


}