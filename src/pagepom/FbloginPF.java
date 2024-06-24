package pagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPF {
	WebDriver driver;
	@FindBy(id = "email")
	WebElement fbemail;
	@FindBy(name = "pass")WebElement fbpassword;
	@FindBy(name = "login")WebElement fblogin;
	
	public FbloginPF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpassword.sendKeys(password);
	}
	public void login()
	{
		fblogin.click();
	}
}
