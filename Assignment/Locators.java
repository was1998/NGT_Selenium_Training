package com.cg.implementation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	@Test
	public void locators() throws InterruptedException {

		// Locating the element by using id
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://phptravels.com/demo");
		// driver.get("https://phptravels.org/register.php");
		// locating element by linktext
		driver.findElement(By.partialLinkText("Sign")).click();
//		String string = driver.getWindowHandle();
//		System.out.println(string);
		driver.switchTo().window("CDwindow-245E6637EE9861E92E8898E313BAA1A4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Locating the element by using id
		driver.findElement(By.id("inputFirstName")).sendKeys("waseem");
		// Locating the element by using Name
		driver.findElement(By.name("lastname")).sendKeys("akhtar");
		// Locating the element by using CSSSelector
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("was@gmail.com");
		// Locating the element by using Tagname
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println("total number of input boxes are" + list.size());
		// Locating the element by using classname
		List<WebElement> list1 = driver.findElements(By.className("form-control"));
		System.out.println("Total number of element with form-control as class name" + list1.size());//
		// Locating the element by using Xpath
		driver.findElement(By.xpath("//div[@class='flag-container']")).click();
		driver.findElement(By.xpath("//li[@data-country-code='ao']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Cont")).click();

	}
}
