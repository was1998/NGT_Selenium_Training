package com.cg.SeleniumAssigment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//opening the website
		driver.get("http://automationpractice.com/index.php");
		//maximize the page
		driver.manage().window().maximize();
		//click on sign button
		driver.findElement(By.linkText("Sign in")).click();
		//entering The email id
		driver.findElement(By.id("email")).sendKeys("mohammedakhtar1998@gmail.com");
		//Entering the password
        driver.findElement(By.id("passwd")).sendKeys("akhtar");
        //click on submit button
        driver.findElement(By.id("SubmitLogin")).click();
		Actions action = new Actions(driver);
		//Click on womens
		WebElement element = driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(element).perform();
		//clicking on T-shirt
		driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
		//Mouse Hover on the product
		WebElement elment1 = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		action.moveToElement(elment1).perform();
		//clicking on more button
		driver.findElement(By.xpath("//a[@title='View']")).click();
		//Increasing the quantity 
		driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
		//Selecting the size as L
		WebElement element3=driver.findElement(By.cssSelector("#group_1"));
		Select select=new Select(element3);
		select.selectByIndex(2);
		//Selecting the color
		driver.findElement(By.cssSelector("a[title='Blue']")).click();
		//Adding to the Cart
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		//Clicking on proceed to checkout button
		//a[@title="Proceed to checkout"]
		driver.findElement(By.xpath("//*[@title='Proceed to checkout']//span")).click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
