package com.cg.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor {
	@Test
	public void mthd() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement elemnt=driver.findElement(By.name("btnI"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",elemnt);
		
		
	}

}
