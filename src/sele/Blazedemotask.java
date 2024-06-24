package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemotask {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("name")).sendKeys("Shahana");
		driver.findElement(By.id("company")).sendKeys("Luminar");
		driver.findElement(By.id("email")).sendKeys("shahana@gmail.com");
		driver.findElement(By.name("password")).sendKeys("saaaa@33hhh");
		driver.findElement(By.name("password_confirmation")).sendKeys("saaaa@33hhh");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")).click();
	}
}
