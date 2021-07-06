package Generic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseTest{
	public String getTilteofPage()
	{
		String titleofPage = driver.getTitle();
		return titleofPage;
	}
	public void verifyTitle(String expectedTitle,String actualTitle, String pageName)
	{
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("the"+pageName+ "page Title is matching test case passed");
				
		}
		else
		{
			System.out.println("the"+pageName+ "page Title is not matching test case failed");
		}
	}
	public void waitForElement(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void waitForPageTime(int time,String title)
	{
		 WebDriverWait wb = new WebDriverWait(driver, time);
		 wb.until(ExpectedConditions.titleContains(title));
	}
	public void mouseHoverOnTheElement(WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	public void rightpClick(WebElement target)
	{
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
	
	}
	public void doubleClick(WebElement source,WebElement target)
	{
		Actions act=new Actions(driver);
		act.doubleClick(source).perform();
	
	}
	public void draganddrop(WebElement source,WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source,target).perform();
	
	}
	public void frameByidorname(String idorname)
	{
		driver.switchTo().frame(idorname);
	}
	public void frameByindex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void frameByWebElementAdress(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void waitforWebElement(int time,String text,WebElement element, String nameofTheElement)
	{
		WebDriverWait wb = new WebDriverWait(driver, time);
		 wb.until(ExpectedConditions.textToBePresentInElement(element, text));
	//System.out.println("the element is displayed and test is passed for Invalid creditals");
	System.out.println("the"+nameofTheElement+"is displayed and test is passed");
	}
		
	public void getOptionsDropdown(WebElement element)
	{
		Select sel=new Select(element);
		List<WebElement> ops = sel.getOptions();//java.util.list
	}
	
	
	public void selectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void getOptionDropDown(WebElement element)
	{
		Select sel=new Select(element);
		 List<WebElement> ops = sel.getOptions();//java.util.list
	for(WebElement we:ops)
	{
		String dropdownops = we.getText();
		System.out.println(dropdownops);
		
	}
	}
	
	
}



