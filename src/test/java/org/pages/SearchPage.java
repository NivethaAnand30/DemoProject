package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindAll({ @FindBy(id = "twotabsearchtextbox"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement txtSearch;

	@CacheLookup
	@FindBys({ @FindBy(xpath = "//input[@type='submit']"), @FindBy(xpath = "//input[@value='Go']") })
	private WebElement btnSearch;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public void setTxtSearch(WebElement txtSearch) {
		this.txtSearch = txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

}
