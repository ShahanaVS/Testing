package testng;


	

	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class Seleniumwaitimplicit{
		ChromeDriver driver;
		@BeforeTest
		public void set()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void url()
		{
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void test()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Actions act = new Actions(driver);
			WebElement mouse = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
			act.moveToElement(mouse);
			act.perform();
			driver.findElement(By.xpath("//a[normalize-space()='Smartphones and accessories']")).click();
			
			//this program doesn't work because we did not give wait (the correct code in selenium wait_)
		}
	}



