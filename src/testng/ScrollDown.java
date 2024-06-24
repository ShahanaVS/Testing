package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();;
	}
	@Test
	public void test()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,3000)","");
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[normalize-space()='Facebook']")));
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[normalize-space()='Privacy Notice']")).click();
	}

}
