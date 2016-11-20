package Linear_Interfaces_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;

public interface Linear_Interface3 {
	
	public WebElement  getClick(By by);
	public void   writeAnything(WebElement element,String type);
	public void  selectDropDown(By by,String dd);
	public WebElement hoverOver(By by);
	public WebElement rightMoClic(By by);
	public Keyboard   getKeyboard();
	public WebElement scrollDown();
	public WebElement elementMoreWork(WebElement ele);
	public void tekeScreensot();
	public WebElement  dragAndDrop();
	public WebElement windowHandle();
	public List<WebElement>  multipleWindowHandles();
	
	
	

}
