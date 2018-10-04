package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_const;
import generic.Excel;
import pom.Giftcardpage;
import pom.Loginpage;

public class Send_giftcard implements Auto_const
{
	static
	{
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		
		String us=Excel.abc(excelpath, "sheet10", 3, 2);
		String pwd=Excel.abc(excelpath, "sheet10", 4, 2);
		
		Loginpage l=new Loginpage(driver);
		l.loginlink();
		l.username(us);
		l.password(pwd);
		l.login();
		
		Giftcardpage g=new Giftcardpage(driver);
		g.gift();
		Thread.sleep(5000);
		g.giftbtn();
		Thread.sleep(5000);
		
		driver.close();
	}
}


