package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		 String s = driver.getTitle();
		 System.out.println(s);
	}
}
