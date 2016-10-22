package com.bambooinvoice;

import org.openqa.selenium.WebDriver;

import com.bi.generics.Utility;

public class ScripttoRunLibrary {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Library.login("rbk.2389@gmail.com","manager");
		
		Library.clickonrds(driver);
		Library.goToClientModule(driver);
		Library.createClient(driver, "HP");
		Library.goToInvoiceModule(driver);
	//	Utility.searchListBox(listbox, "HP");
		Library.goToClientModule(driver);
		Library.deleteClient(driver, "HP");
		Library.logout(driver);
		driver.close();
	}
}


