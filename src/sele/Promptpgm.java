package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		driver.switchTo().alert().sendKeys("shahana");
		driver.switchTo().alert().accept();
		
	}

}
