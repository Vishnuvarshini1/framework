package com.adaction.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocator extends Base {
	public SearchHotelLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Location")
	private WebElement location;
	@FindBy(name="Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getSearch() {
		return search;
	}
}
