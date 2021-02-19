package org.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.pages.LoginPage;
import org.utility.BaseClass;

public class FaceBook extends BaseClass {

	public static void main(String[] args) throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximizeBrowser();

		LoginPage l = new LoginPage();

		WebElement txtEmail = l.getTxtEmail();
		insert(txtEmail, readData(1, 0));

		insert(l.getTxtPass(), readData(1, 1));

		click(l.getBtnLogIn().get(2));
	}
}
