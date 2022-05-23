package com.cg.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {
	@Test
	public void methd() throws InterruptedException {
		// courses-iframe
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement element = driver.findElement(By.xpath("//div[@id='Multiple']//iframe"));
		driver.switchTo().frame(element);
		WebElement element2 = driver.findElement(By.xpath("//div[@class='container']//div[@class='row']//iframe"));
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chabu");
		Thread.sleep(5000);

		driver.quit();
	}

}
