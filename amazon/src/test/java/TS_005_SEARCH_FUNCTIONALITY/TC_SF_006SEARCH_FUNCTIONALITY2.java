package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_SF_006SEARCH_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void search_placeholder() {
		driver.manage().window().maximize();

		WebElement phsearch = driver.findElement(By.xpath(loc.getProperty("search_box_SF_001")));
		String phsearchtext = phsearch.getAttribute("placeholder");
		System.out.println("search placeholder text is = " + phsearchtext);
		String ExpectedsearchText = loc.getProperty("ExpectedsearchText_SF_006");
		Assert.assertEquals(phsearchtext, ExpectedsearchText);

	}
}
