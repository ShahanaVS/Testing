package sele;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///E:/alert.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();//
		
		
		//next method
		
		Alert a = driver.switchTo().alert();
		String act = a.getText();
		String exp = "hello! I am an alert box!!";
		if(act.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("shahana");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("V S");
	}

}
