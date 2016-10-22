package com.bambooinvoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bi.generics.Utility;


public class DeleteConfirm {
	public static void main(String[] args) {
		WebDriver driver=Library.login("rbk.2389@gmail.com", "manager");
		Library.deleteClient(driver,"HP");
		Library.goToInvoiceModule(driver);
		WebElement listBox=driver.findElement(By.id("client_id"));
		boolean found=Utility.searchListBox(listBox,"HP");
		if(found)
		{
			System.out.println("Fail:Client HP is still present");
	    }
		else{
			System.out.println("Fail:Client HP is still present");
			}
		Library.logout(driver);
		driver.close();
}
}