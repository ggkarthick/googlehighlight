package org.progit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitproject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthick\\eclipse-workspace\\Gitpro\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.id("SIvCob"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].set attribute('style','background:yellow'), id");
		js.executeScript("arguments[0].setAttribute('style','background:violet')",id);	
		
	}

}
