package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removecartpage 
{
	@FindBy(xpath="//a[@class='delete-item']")
	private WebElement remove;
	
	public Removecartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void remove() throws InterruptedException
	{
		remove.click();
		Thread.sleep(5000);
	}
}


