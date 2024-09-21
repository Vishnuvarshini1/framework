package com.adactin.pages;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import adactin.withoutpf.SelectHotelwopf;


public class SelectHotelpage extends Base {

	public static SelectHotelwopf selectHotel = new SelectHotelwopf();
	
	public static void selectHotelAndClickContinue() {
		try {
			WebElement radioBtn = findBy(selectHotel.firstHotelRadioBtn);
			radioBtn.click();
			
			WebElement continueBtn = findBy(selectHotel.continueBtn);
			continueBtn.click();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
