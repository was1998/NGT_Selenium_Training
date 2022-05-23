package com.cg.implementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsInSelenium 
{
	@Test
	public void metd() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Using explicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("waseem");
//		driver.findElement(By.id("ndjfngk"));
		//Using Implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ssssss")));
		driver.quit();
		driver.close();
	}

}
