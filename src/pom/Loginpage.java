package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(xpath="//a[.='Log-in']")
	private WebElement loginlink;
	
	@FindBy(xpath="//input[@class='email required input_authentication']")
	private WebElement username;
	
	@FindBy(xpath="//input[@class='required input_authentication']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginlink()
	{
		loginlink.click();
	}
	
	public void username(String us)
	{
		username.sendKeys(us);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void login()
	{
		login.click();
	}
}
