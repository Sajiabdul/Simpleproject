package org.adactintask;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver;
@BeforeClass
public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
}
public static void dataSend(WebElement element,String data) {
	element.sendKeys(data);
}
}

