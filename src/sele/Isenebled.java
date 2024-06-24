package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenebled {
	
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		 boolean logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isEnabled();
		 if(logo)
		 {
			 System.out.println("logo is present");
		 }
		 else
		 {
			 System.out.println("logo is not present");
		 }
		boolean b = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(b)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		boolean v = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled();
		if(v)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disabled");
		}
		
	}
	

}
