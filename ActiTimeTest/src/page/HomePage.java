package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		@FindBy(xpath="//div[text()='Setting']") private WebElement Settings;

		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		
		public WebElement getSettings()
		{
			return Settings;
		}
		public void clickSettings()
		{
			Settings.click();
		}

}
