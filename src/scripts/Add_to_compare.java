package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_const;
import generic.Excel;
import pom.Comparepage;
import pom.Homepage;
import pom.Loginpage;
import pom.Productpage;

public class Add_to_compare implements Auto_const
{
	static 
	{
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		
		String us=Excel.abc(excelpath, "sheet2", 3, 2);
		String pwd=Excel.abc(excelpath, "sheet2", 4, 2);
		String product=Excel.abc(excelpath, "sheet2", 6, 2);
		
		Loginpage l=new Loginpage(driver);
		l.loginlink();
		l.username(us);
		l.password(pwd);
		l.login();
		
		Homepage h=new Homepage(driver);
		h.search(product);
		h.searchbtn();
		
		Productpage p=new Productpage(driver);
		p.quilt();
		
		Comparepage c=new Comparepage(driver);
		c.cmpbtn();
		
		driver.close();
	}
}


