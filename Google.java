package org.Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\eclipse-workspace\\SeleniumWEb\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();

		
		Actions ac= new Actions(driver);
		
		WebElement yui= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		
		yui.sendKeys("waterbottle");
	}

}
