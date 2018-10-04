package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class changecolorpage 
{
	@FindBy(xpath="//span[.='\r\n" + 
			"Aqua\r\n" + 
			"']")
	private WebElement color;
	
	public changecolorpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void color()
	{
		color.click();
	}
	
}

