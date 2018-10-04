package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist 
{
	@FindBy(xpath="//span[@class='icofont icofont-heart_outline_thick wishicon']")
	private WebElement dining;
	
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dining()
	{
		dining.click();
	}
}

