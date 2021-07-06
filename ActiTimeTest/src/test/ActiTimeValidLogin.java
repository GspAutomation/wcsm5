package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.CustomListner;
import Generic.Flib;
import Generic.WebDriverCommonLib;
import page.LoginPage;

@Listeners(CustomListner.class)
public class ActiTimeValidLogin extends BaseTest {
	@Test
	  public void ActiTimeLoginValid() throws IOException
	  {
	  	Flib flib = new Flib();
	  	String username = flib.readPropertyFile(PROP_PATH, "un");
	  	String password = flib.readPropertyFile(PROP_PATH, "pwd");
	  	LoginPage lp=new LoginPage(driver);
	  	lp.validLoginActiTime(username, password);
	  	
	  	
	  	WebDriverCommonLib wdc = new WebDriverCommonLib();
	  	wdc.waitForPageTime(30, "Enter12");
	  	String homePageTitle = wdc.getTilteofPage();
	  	Assert.assertEquals(homePageTitle,"actiTIME - Enter Time-Track");
	  	
	  }


}
