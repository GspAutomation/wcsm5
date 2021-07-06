package Generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;


public class BaseTest implements IAutoConstant {
	protected static WebDriver driver;

	@BeforeMethod
   public void setUp() throws IOException
	{
		Flib f=new Flib();
		String browserValue = f.readPropertyFile(PROP_PATH, "browser");
		String urlValue = f.readPropertyFile(PROP_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(urlValue);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();//open thr browser
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();//maximize windows
			driver.get(urlValue);
		}
		else
		{
			System.out.println("invalid value");
		}
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	public void fail(String methodname)
	{   try
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/new1.png");
		Files.copy(src, dest);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	}
}

