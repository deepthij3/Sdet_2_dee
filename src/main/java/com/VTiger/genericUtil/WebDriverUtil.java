package com.VTiger.genericUtil;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil 
{
WebDriver driver;

public WebDriverUtil(WebDriver driver) 
{
	this.driver=driver;
	}
public void maximizewindow() 
{
	driver.manage().window().maximize();
}

public void pageLoadTimeout() 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

public void selectValueFromDd(WebElement element, String value) 
{
	Select s = new Select(element);
	s.selectByValue(value);
	}

public void selectValueFromDd(WebElement element, int index) 
{
	Select s = new Select(element);
	s.selectByIndex(index);
	}

public void selectValueFromDd(String text, WebElement element) 
{
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}

public void moveToElement(WebElement element) 
{
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	}

public void clickByOffset(int xoffset, int yoffset) 
{
	Actions a = new Actions(driver);
	a.moveByOffset(xoffset, yoffset).click();
	}

public void rightClick() 
{
	Actions a = new Actions(driver);
	a.contextClick();
}

public void switchToFrame(int Index)
{
	driver.switchTo().frame(Index);
	}

public void switchToFrame(String id) 
{
	driver.switchTo().frame(id);
	}

public void switchToFrame(WebElement element)
{
	driver.switchTo().frame(element);
	}

public void acceptAlert() 
{
	driver.switchTo().alert().accept();
}

public void dismissAlert()
{
	driver.switchTo().alert().dismiss();
}
public void sendKeys(WebElement element, String keysToSend) 
{
	element.sendKeys(keysToSend);
}

public void scrollToElement(WebElement element) 
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView", element);
}

public void scrollByPosition(int x, int y) 
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
}

public void switchToWindow(String title) 
{
	Set<String> winids=driver.getWindowHandles();
	for(String id: winids)
	{
		String currentTitle= driver.switchTo().window(id).getTitle();
		System.out.println(currentTitle);
		if(currentTitle.contains(title))
		{
			break;
		}
	}
}






}
