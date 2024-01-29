package com.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demowebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage/");
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("Dharshini");
//		
		driver.findElement(By.xpath("//input[@name='lname']")).clear();
	    driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Sakthivel");
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
		

	}

}
