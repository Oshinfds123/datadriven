package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removecomparepage 
{
	@FindBy(xpath="//div[@class='remove-prod-cta']")
	private WebElement remove;
	
	public Removecomparepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void remove()
	{
		remove.click();
	}
}

