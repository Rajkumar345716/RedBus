package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromer.driver", "C:\\Users\\Admin\\eclipse-workspace\\SelRedbus\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		//Id Locator
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.className("sc-bxivhb hrsLPT"));
		to.sendKeys("Madurai");
	}

}
