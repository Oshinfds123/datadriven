package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_const;
import generic.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Productpage;
import pom.Wishlist;

public class Add_to_wishlist implements Auto_const
{
	static
	{
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		
		String us=Excel.abc(excelpath, "sheet3", 3, 2);
		String pwd=Excel.abc(excelpath, "sheet3", 4, 2);
		String product=Excel.abc(excelpath, "sheet3", 6, 2);
		
		Loginpage l=new Loginpage(driver);
		l.loginlink();
		l.username(us);
		l.password(pwd);
		l.login();
		
		Homepage h=new Homepage(driver);
		h.search(product);
		h.searchbtn();
		
		Productpage p=new Productpage(driver);
		p.dining();
		
		Wishlist w=new Wishlist(driver);
		w.dining();
		
		driver.close();
	}
}

