package com.adactin.pages;


import org.base.Base;

import org.openqa.selenium.WebElement;



import adactin.withoutpf.Searchwopf;

public class SearchHotelpage extends Base {
	public static Searchwopf search=new Searchwopf();
	public static void selectLocation(String location) {
		try {
			
			WebElement loc = findBy(search.location);
			 
			selectByVisibleText(loc, location);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static void clickOnSearch() {
			try {
				WebElement submit=findBy(search.submit);
				click(submit);
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

