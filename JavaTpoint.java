package org.Website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaTpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\eclipse-workspace\\SeleniumWEb\\driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
        
		
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		
		driver.get("https://artoftesting.com");
		

		Actions act = new Actions(driver);

		WebElement vhu= driver.findElement(By.linkText("Automation"));
		
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		
		act.moveToElement(vhu).perform();
		
       WebElement tyu = driver.findElement(By.xpath("//*[@id=\"menu-item-1005\"]/a"));
       
       
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

       
		Actions ace= new Actions(driver);
		
		ace.moveToElement(tyu).click().perform();
		
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1600)");

        
        WebElement eiu= driver.findElement(By.xpath("//*[@id=\"post-1001\"]/div/div[2]/p[5]/strong/a"));
        
        eiu.click();
        
        driver.manage().window().maximize();
	}

}
