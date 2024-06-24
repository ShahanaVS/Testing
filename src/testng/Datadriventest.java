package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() throws IOException
	{
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Seleniumclass\\excel\\data.xlsx.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String email = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("email = "+email);
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password = "+password);
			
			
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			
			//login validation choichal
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);
			String expecurl = "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348092";
			if(expecurl.equals(actualurl))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("login failed");
			}
			
			
			
		}
	}
	

}
