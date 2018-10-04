package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(id="search")
	private WebElement search;
	
	@FindBy(id="search_button")
	private WebElement searchbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search(String product)
	{
		search.sendKeys(product);
	}
	
	public void searchbtn()
	{
		searchbtn.click();
	}
}
