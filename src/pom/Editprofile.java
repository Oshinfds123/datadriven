package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editprofile
{
	@FindBy(xpath="//a[.='Profile']")
	private WebElement profile;
	
	@FindBy(id="edit")
	private WebElement edit;
	
	@FindBy(id="user_name")
	private WebElement name;
	
	@FindBy(xpath="//input[@class='button primary']")
	private WebElement submit;
	
	public Editprofile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void profile()
	{
		profile.click();
	}
	
	public void edit()
	{
		edit.click();
	}
	
	public void name(String us_name)
	{
		name.sendKeys(us_name);
	}
	
	public void submit()
	{
		submit.click();
	}
}

