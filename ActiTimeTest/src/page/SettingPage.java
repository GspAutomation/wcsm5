package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage {
@FindBy(xpath="//div[.='Settings']")private WebElement setting;
@FindBy(name="firstHierarchyLevelCode")private WebElement firstdropdown;
@FindBy(name="secondHierarchyLevelCode")private WebElement seconddropdown;
@FindBy(name="thirdHierarchyLevelCode")private WebElement thirddropdown;




public SettingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
public WebElement getThirddropdown() {
	return thirddropdown;
}
public void setThirddropdown(WebElement thirddropdown) {
	this.thirddropdown = thirddropdown;
}
public WebElement getSetting() {
	return setting;
}
public WebElement getFirstdropdown() {
	return firstdropdown;
}
public WebElement getSeconddropdown() {
	return seconddropdown;
}

public void cliclSetting()
{
	setting.click();
}
}
