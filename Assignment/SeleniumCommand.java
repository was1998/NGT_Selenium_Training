package com.cg.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCommand {
	@Test
	public void methd() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//entering data using send keys
		driver.findElement(By.id("email")).sendKeys("asdsa");
		Thread.sleep(3000);
		//clearing textbox data
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		//geting text from webelement
		WebElement element=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println("the text is:"+element.getText());
		//using click method
		element.click();
		//Using naviagte back
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//Using navigate forward
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("asdsa");
		Thread.sleep(3000);
		//using refersh method
		driver.navigate().refresh();
		driver.navigate().to("https://www.instagram.com/?hl=en");
		//using browser quit command
		driver.quit();
		
		
	}

}
