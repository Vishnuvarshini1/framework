package adactin.page.repository;

import com.adaction.locators.LoginPageLocators;
import com.adaction.locators.SearchHotelLocator;

import adactin.withoutpf.BookHotelwopf;
import adactin.withoutpf.Loginwopf;
import adactin.withoutpf.Searchwopf;
import adactin.withoutpf.SelectHotelwopf;

public class PageRepo {
	private Loginwopf login;
	private Searchwopf search;
	private SelectHotelwopf select;
	private BookHotelwopf book;
	public Loginwopf getLogin() {
		return login;
	}
	public Searchwopf getSearch() {
		return search;
	}
	public SelectHotelwopf getSelect() {
		return select;
	}
	public BookHotelwopf getBook() {
		book = new BookHotelwopf();
		return book;
	}
	
}
