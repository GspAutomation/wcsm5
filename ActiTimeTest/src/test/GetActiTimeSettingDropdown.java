package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Flib;
import Generic.WebDriverCommonLib;
import page.LoginPage;
import page.SettingPage;

public class GetActiTimeSettingDropdown extends BaseTest{
@Test
public void getfirstoption() throws IOException
{
	 
      Flib flib = new Flib();
     String username = flib.readPropertyFile(PROP_PATH, "un");
     String password = flib.readPropertyFile(PROP_PATH, "pwd");
     
	LoginPage lp=new LoginPage(driver);
	lp.validLoginActiTime(username, password);
	SettingPage sp=new SettingPage(driver);
	WebElement firstDropDown = sp.getFirstdropdown();
	WebDriverCommonLib wdc = new WebDriverCommonLib();
	
	wdc.getOptionDropDown(firstDropDown);
}
@Test
public void getsecondoption() throws IOException
{
	 
      Flib flib = new Flib();
     String username = flib.readPropertyFile(PROP_PATH, "un");
     String password = flib.readPropertyFile(PROP_PATH, "pwd");
     
	LoginPage lp=new LoginPage(driver);
	lp.validLoginActiTime(username, password);
	SettingPage sp=new SettingPage(driver);
	WebElement secondDropDown = sp.getSeconddropdown();
	WebDriverCommonLib wdc = new WebDriverCommonLib();
	
	wdc.getOptionDropDown(secondDropDown);
}
@Test
public void getthirdtoption() throws IOException
{
	 
      Flib flib = new Flib();
     String username = flib.readPropertyFile(PROP_PATH, "un");
     String password = flib.readPropertyFile(PROP_PATH, "pwd");
     
	LoginPage lp=new LoginPage(driver);
	lp.validLoginActiTime(username, password);
	SettingPage sp=new SettingPage(driver);
	WebElement thirdDropDown = sp.getThirddropdown();
	WebDriverCommonLib wdc = new WebDriverCommonLib();
	
	wdc.getOptionDropDown(thirdDropDown);
}


}