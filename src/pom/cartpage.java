package pom;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage 
{
	@FindBy(name="button")
	private WebElement cartbtn;
	
	public cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cartbtn()
	{
		cartbtn.click();
	}
}


