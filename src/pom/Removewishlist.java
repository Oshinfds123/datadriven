package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removewishlist 
{
	@FindBy(xpath="//span[@class='icofont wishicon icofont-heart_fill selected']")
	private WebElement remove;
	
	public Removewishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void remove()
	{
		remove.click();
	}
}

