package testng;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		
		String exp = "Amazon.in : mobilephones";
		String act = driver.getTitle();
		Assert.assertEquals(act, exp);
		System.out.println(act);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String parentWindow = driver.getWindowHandle();
		js.executeScript("window.scrollBy(0,300)", " ");
		 WebElement first = driver.findElement(By.xpath("//*[contains(@target,'blank')]"));
		 first.click();
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String handle : allwindowhandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				js.executeScript("window.scrollBy(0,300)", " ");
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				driver.close();
			}
		}
	}
}
