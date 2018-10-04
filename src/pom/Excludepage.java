package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Excludepage 
{
	@FindBy(id="filters_availability_In_Stock_Only")
	private WebElement exclude;
	
	public Excludepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void exclude()
	{
		exclude.click();
	}
}

