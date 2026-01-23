package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.loginpage;

public class logintest extends BaseTest {
	
@Test	
public void loginflow()
{
	loginpage lp=new loginpage(driver);
	lp.clicklogin();
	lp.login("abcd@gmail.com", "abcd@123");
	if(lp.iserror())
	{
		System.out.println("Error detected → switching to signup flow");
		lp.signup("anushya", "anushya@mail.com");
	}
}
}

