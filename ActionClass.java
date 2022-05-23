package com.cg.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
@Test
public void method() throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement element=driver.findElement(By.id("mousehover"));
	Actions action=new Actions(driver);
	//Mouse Hover
	action.moveToElement(element).perform();
	Thread.sleep(5000);
	//using drag and drop
	driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	WebElement element1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement element2=driver.findElement(By.xpath("//div[@id='trash']"));
	action.dragAndDrop(element1, element2).perform();
	Thread.sleep(5000);
}
}
