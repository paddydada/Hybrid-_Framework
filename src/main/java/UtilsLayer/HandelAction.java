package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class HandelAction extends BaseClass{

	//click and sendkeys Action handle 

	public static Actions act;

	//click

	public static void click(WebElement wb) {
		act = new Actions(driver);
		act.click(wb).build().perform();
	}

	public static void sendkeys(WebElement wb, String value) {
		act = new Actions(driver);
		act.sendKeys(wb,value).build().perform();
	}


}
