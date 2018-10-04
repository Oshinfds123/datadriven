package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_const;
import pom.cartpage;
import pom.changecolorpage;
import pom.Homepage;
import pom.Loginpage;
import pom.Productpage;

public class Change_color implements Auto_const
{
	static
	{
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		
		Loginpage l=new Loginpage(driver);
		l.loginlink();
		l.username("rita.michael@gmail.com");
		l.password("qwertyuiop");
		l.login();
		
		Homepage h=new Homepage(driver);
		h.search("Window Curtains");
		h.searchbtn();
		
		Productpage p=new Productpage(driver);
		p.curtain1();
		Thread.sleep(5000);
		
		changecolorpage c=new changecolorpage(driver);
		c.color();
		
		cartpage cp=new cartpage(driver);
		cp.cartbtn();
	}
}


