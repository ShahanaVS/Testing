package testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepom.FbloginPF;

public class FblogintestPF {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		FbloginPF ob = new FbloginPF(driver);
		ob.setvalues("abc@gmail.com", "abcg");
		ob.login();
	}
}
