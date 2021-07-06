package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/*//declration
			@FindBy(name="username")private WebElement usn;
			@FindBy(name="pwd")private WebElement pwd;
			@FindBy(xpath="//a[@id='loginButton']")private  WebElement login;
	        @FindBy(xpath="//span[@class='errormsg' and contains(.,'invalid')]")private WebElement errmsg;
			
				//intialization
				public LoginPage(WebDriver driver) //constructor create using right click source create constructor
				{
					PageFactory.initElements(driver, this);
				}
				
			//utilization
			public WebElement getUsn() {
				return usn;
			}
			public WebElement getPwd() {
				return pwd;
			}
			public WebElement getLogin() {
				return login;
			}
			
			//generic reusable method to login
				public void validActiTimeLogin(String username,String password)
				{
					usn.sendKeys(username);
					pwd.sendKeys(password);
					login.click();
				}
				
				public void invalidActiTimeLogin(String username,String password) throws InterruptedException
				{
					usn.clear();
					usn.sendKeys(username);
					pwd.sendKeys(password);
					login.click();
				Thread.sleep(2000);
					
				}
				public WebElement errormsg()
				{
					return errmsg;
					
				}
				
			
		}*/

	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(xpath ="//span[@class='errormsg' and contains(.,'invalid')]") private WebElement errMsg;
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	//utilization
	public WebElement getUsn() {
		return usn;
	}
	


	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//generic reusable method to do a valid login
	public void validLoginActiTime(String username,String password)
	{   usn.sendKeys(username);
		psw.sendKeys(password);
		loginBtn.click();	
	}
	//generic reusable method for invalid login
	public void InvalidLoginActiTime(String username,String password) throws InterruptedException
	{  
		usn.clear();
		Thread.sleep(2000);
		usn.sendKeys(username);
		Thread.sleep(2000);

		psw.sendKeys(password);
		loginBtn.click();
		Thread.sleep(3000);
	}
	public WebElement getErrMsg() {
		
		return errMsg;
	}

}


