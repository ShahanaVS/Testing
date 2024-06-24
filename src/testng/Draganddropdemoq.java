package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddropdemoq {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement  dest = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest);
		act.perform();
		
		String text = dest.getText();
		
		if(text.equals("Dropped"))
		{
			System.out.println("Dropped!");
		}
		else
		{
			System.out.println("not expected");
		}
	}

}
