package com.bambooinvoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.bi.generics.Utility;

public class ScriptCreateClient {
	public static void main(String[] args) {
		
		WebDriver driver=Library.login("rbk.2389@gmail.com","manager");
		Library.createClient(driver, "HP");
		Library.goToInvoiceModule(driver);
		WebElement listBox=driver.findElement(By.id("client_id"));
		boolean found=Utility.searchListBox(listBox, "HP");
		if(found) 
		{
			System.out.println("Pass: Client HP is present in InvoiceModule");
		}
		else
		{
			System.out.println("Pass: Client HP is not present in InvoiceModule");
		}
		Library.logout(driver);
		driver.close();
		}
}
