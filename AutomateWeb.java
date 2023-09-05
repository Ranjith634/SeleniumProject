package org.Website;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Select;

public class AutomateWeb {

	

		
		public static void main(String[] args) throws Exception  {
			// TODO Auto-generated method stub
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\eclipse-workspace\\SeleniumWEb\\driver\\chromedriver.exe");
			
			var F1 = "Ranjith";
			
			var F2 = "Manohar";
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://lmhub.in/");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Actions act = new Actions(driver);
			
		    WebElement ele = driver.findElement(By.linkText("Training Module"));
		   
			act.moveToElement(ele).perform();
			
			
			WebElement vb = driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[3]/div/a"));
			
			Actions ace= new Actions(driver);
			ace.moveToElement(vb).click().perform();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,700)");
			
			
			WebElement epv = driver.findElement(By.xpath("/html/body/div[6]/div[2]/form/div[1]/div/div[1]/input"));
			
			epv.sendKeys(F1);
			
			driver.manage().window().maximize();

			js.executeScript("window.scroll(0,650)");
			
			WebElement nvj = driver.findElement(By.xpath("/html/body/div[6]/div[2]/form/div[1]/div/div[2]/input"));
			
			nvj.sendKeys(F2);
			
			js.executeScript("window.scroll(0,650)");
			
			WebElement vmc = driver.findElement(By.xpath("/html/body/div[6]/div[2]/form/div[2]/input"));
			
			vmc.sendKeys("rahulranjith8919@gmail.com");
			
			js.executeScript("window.scroll(0,650)");
			
			WebElement value = driver.findElement(By.id("yourexpertise"));
			
			Select expert = new Select(value);
			
			expert.selectByVisibleText("Entertainment and Media");
			
			js.executeScript("window.scroll(0,650)");
			
			WebElement nml = driver.findElement(By.name("comments"));
	       
			nml.sendKeys("Nowadays Social Media are the most advance for getting information earlier. Because everyone we are using smart phones where we can know everything by browse the internet");

			js.executeScript("window.scroll(0,700)");
			
			driver.findElement(By.xpath("//input[@value='Submit']")).submit();
			
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	      	 }


}
