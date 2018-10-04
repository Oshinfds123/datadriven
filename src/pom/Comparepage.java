package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Comparepage
{
	@FindBy(xpath="//span[@class='icon icofont-compare_unfilled']")
	private WebElement cmpbtn;
	
	public Comparepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cmpbtn()
	{
		cmpbtn.click();
	}
}




