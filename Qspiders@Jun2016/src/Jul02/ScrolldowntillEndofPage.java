package Jul02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrolldowntillEndofPage {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.com");
		String xp="//a[contains(text(),'Advertising Programmes')]";
		WebElement sp = driver.findElement(By.xpath(xp));
		int y=sp.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="window.scrollBy(0,"+y+")"; //to get the exact value of y, so here we need to concatinate "y".
		js.executeScript(script);
	}

}
