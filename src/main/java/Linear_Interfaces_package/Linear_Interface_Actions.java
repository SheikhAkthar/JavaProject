package Linear_Interfaces_package;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface Linear_Interface_Actions {
	public Actions build();
	public Actions click();
	public Actions click(WebElement onElement);
	public Actions clickAndHold();
	public Actions clickAndHold(WebElement onElement);
	public Actions contextClick();
	public Actions contextClick(WebElement onElement);
	public Actions  doubleClick();
	public Actions doubleClick(WebElement onElement);
	public Actions dragAndDrop(WebElement source, WebElement target);
	public Actions dragAndDropBy(WebElement source, int xOffset, int yOffset);

	public Actions keyDown(Keys thekey);
	public Actions keyDown(WebElement element, Keys theKey);
	public Actions keyUp(Keys theKey);
	public Actions keyUp(WebElement element, Keys theKey);
	public Actions pause(long pause);
	public Actions perform();
	public Actions release();
	public Actions  release(WebElement onElement);
	public Actions sendKeys(CharSequence keysToSend);
	public Actions sendKeys(WebElement element, CharSequence keysToSend);
	public Actions moveByOffset(int xOffset, int yOffset);
	public Actions moveToElement(WebElement toElement);
	public Actions moveToElement(WebElement toElement, int xOffset, int yOffset);
	

}
