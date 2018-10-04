package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage 
{
	@FindBy(xpath="//span[.='Otto Study Lamp ']")
	private WebElement stdlmp;
	
	@FindBy(xpath="//span[.='Ayana Bedsheet Set ']")
	private WebElement bedsheet;
	
	@FindBy(xpath="//span[.='Diner 4 Seater Dining Table Set ']")
	private WebElement dining;
	
	@FindBy(xpath="//span[.='Rille Box Storage Bed ']")
	private WebElement quilt;
	
	@FindBy(xpath="//span[.='Umbra Blackout Window Curtains - Set Of 2 ']")
	private WebElement curtain;
	
	public Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void stdlmp()
	{
		stdlmp.click();
	}
	
	public void bedsheet() throws InterruptedException
	{
		bedsheet.click();
		Thread.sleep(5000);
	}
	
	public void dining() throws InterruptedException
	{
		dining.click();
		Thread.sleep(5000);
	}
	public void quilt() throws InterruptedException
	{
		quilt.click();
		Thread.sleep(8000);
	}
	public void curtain1()
	{
		curtain.click();
	}}
