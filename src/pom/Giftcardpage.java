package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcardpage 
{
	@FindBy(xpath="//a[.=' Gift Cards ']")
	private WebElement gift;
	
	@FindBy(xpath="//img[@class='_2ebST']")
	private WebElement giftbtn;
	
	public Giftcardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gift() throws InterruptedException
	{
		Thread.sleep(5000);
		gift.click();
	}
	
	public void giftbtn()
	{
		giftbtn.click();
	}
}

