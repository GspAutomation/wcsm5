package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.CustomListner;
import Generic.Flib;
import Generic.WebDriverCommonLib;
import page.LoginPage;

@Listeners(CustomListner.class)
public class ActiTimeInvalidLogin extends BaseTest {
	@Test
	public void invalidLoginActiTimeTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		WebDriverCommonLib wb = new WebDriverCommonLib();

		int rc = flib.getRowCount(EXCEL_PATH, "Invalid");
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcel(EXCEL_PATH, "Invalid", i, 0);
			
			String password = flib.readExcel(EXCEL_PATH, "Invalid", i, 1);
			lp.InvalidLoginActiTime(username, password);

			WebElement errmsg = lp.getErrMsg();
			wb.waitForElement(20);
			wb.waitforWebElement(30, "invalid", errmsg,"error message");




		}
	}

}
