package com.cg.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Controllers {
	@Test
	public void mtd() throws Exception {
		// https://rahulshettyacademy.com/AutomationPractice/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Radio Buttton
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		// DropDown
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(element);
		select.selectByVisibleText("Option2");
		// Selecting radio button
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.findElement(By.name("checkBoxOption3")).click();
		//handling table
	String string=	driver.findElement(By.xpath("//div[@class=\"left-align\"]//table[@id=\"product\"]//tbody//tr[1]//th[1]")).getText();
	System.out.println(string);
	}
}
