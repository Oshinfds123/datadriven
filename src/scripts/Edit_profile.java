package scripts;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import generic.Auto_const;
import generic.Excel;
import pom.Editprofile;
import pom.Loginpage;

public class Edit_profile implements Auto_const
{
	static 
	{
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		
		String us=Excel.abc(excelpath, "sheet4", 3, 2);
		String pwd=Excel.abc(excelpath, "sheet4", 4, 2);
		String us_name=Excel.abc(excelpath, "sheet4", 9, 2);
		
		Loginpage l=new Loginpage(driver);
		l.loginlink();
		l.username(us);
		l.password(pwd);
		l.login();
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		Editprofile e=new Editprofile(driver);
		e.profile();
		e.edit();
		e.name(us_name);
		e.submit();
		Thread.sleep(5000);
		
		driver.close();
	}
}


