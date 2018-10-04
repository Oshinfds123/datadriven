package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_const;
import generic.Excel;
import pom.Excludepage;
import pom.Homepage;
import pom.Loginpage;

public class Exclude_stock implements Auto_const
{
	static
	{
		System.setProperty(key, value);
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		
		String us=Excel.abc(excelpath, "sheet5", 3, 2);
		String pwd=Excel.abc(excelpath, "sheet5", 4, 2);
		String product=Excel.abc(excelpath, "sheet5", 6, 2);
		
		Loginpage l=new Loginpage(driver);
		l.loginlink();
		l.username(us);
		l.password(pwd);
		l.login();
		
		Homepage h=new Homepage(driver);
		h.search(product);
		h.searchbtn();
		
		Excludepage e=new Excludepage(driver);
		e.exclude();
		
		driver.close();
	}
}


