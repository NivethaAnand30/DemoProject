package org.test;

import org.pages.SearchPage;
import org.utility.BaseClass;

public class Amazon extends BaseClass{
	
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.amazon.in/");
		maximizeBrowser();
		
		SearchPage s=new SearchPage();
		
		insert(s.getTxtSearch(), "watch");
		click(s.getBtnSearch());
		
	}

}
