package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqapagetextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/text-box");
driver.findElement(By.id("userName")).sendKeys("Dharshini");
driver.findElement(By.id("userEmail")).sendKeys("sdsmail@gmail.com");
driver.findElement(By.id("currentAddress")).sendKeys("chennai,tamilnadu");
driver.findElement(By.id("permanentAddress")).sendKeys("erode,tamilnadu");
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.id("submit")).click();
	}

}
