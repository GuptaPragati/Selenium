package practices;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Guru_Test extends base {
	
	public WebDriver driver;
	int count=0;
	@Test
	public void inilialize()  throws IOException
	{
		/*driver=initialise();
		driver.get("http://live.guru99.com/index.php/backendlogin");
		*/
		
		String s="fgdgfhjghj";
		char[] c=s.toCharArray();
		String ns="";
	
		System.out.println(c);
		for(int i=s.length()-1;i>=0;i--)
		{
			ns=ns+s.charAt(i);
		}
		System.out.println(ns);
		
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='g')
				{
					count++;
				}
				else
				{continue;}
			}
		
		System.out.println(count);
	}
	

}
