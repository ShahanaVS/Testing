package sele;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googledemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle = driver.getTitle();
		String expec = "Google";
		if(actualtitle.equals(expec))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
