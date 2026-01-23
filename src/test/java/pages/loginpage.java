package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import base.BaseTest;

public class loginpage {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		this.wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
		By login=By.xpath("//a[normalize-space()='Signup / Login']");
		By usermail=By.xpath("//input[@data-qa='login-email']");
		By password=By.xpath("//input[@placeholder='Password']");
		By login1=By.xpath("//button[normalize-space()='Login']");
		By errortxt=By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
		By signname=By.xpath("//input[@placeholder='Name']");
		By signmail=By.xpath("//input[@data-qa='signup-email']");
		By signin=By.xpath("//button[normalize-space()='Signup']");

	public void clicklogin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}
	public void login(String email,String pass)
	{
		driver.findElement(usermail).sendKeys(email);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login1).click();
		
		
	}
	public boolean iserror()
	{
		return driver.findElements(errortxt).size() > 0;
		
	}
	public void signup(String name,String signinmail)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(signname));
		driver.findElement(signname).sendKeys(name);
		driver.findElement(signmail).sendKeys(signinmail);
		driver.findElement(signin).click();
		
		
	}
	
	

}
