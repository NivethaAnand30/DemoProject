package org.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private List<WebElement> btnLogIn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public List<WebElement> getBtnLogIn() {
		return btnLogIn;
	}

	public void setBtnLogIn(List<WebElement> btnLogIn) {
		this.btnLogIn = btnLogIn;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

}
