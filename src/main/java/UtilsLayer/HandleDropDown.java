package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	//3 ways method 
	//	selectByVisibleText
	//	selectByIndex
	//	selectByValue

	public static Select sel;

	public static void selectByVisibleText(WebElement wb,String value) {
		sel =  new Select(wb);
		sel.selectByVisibleText(value);
	}

	public static void selectByValue(WebElement wb,String value) {
		sel =  new Select(wb);
		sel.selectByVisibleText(value);
	}

	public static void selectByvisibleText(WebElement wb,String value) {
		sel =  new Select(wb);
		sel.selectByVisibleText(value);
	}

	public static void selectByIndex(WebElement wb,int value) {
		sel =  new Select(wb);
		sel.selectByIndex(value);
	}

}
