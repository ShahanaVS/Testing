package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm2 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test1()
	{
		String actual = driver.getTitle();
		String expec = "Google";
		if(actual.equals(expec))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void test2()
	{
		String actualcontent = driver.getPageSource();
		String expectedcontent = "Gmail";
		if(actualcontent.contains(expectedcontent))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	

}
