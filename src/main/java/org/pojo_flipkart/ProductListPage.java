package org.pojo_flipkart;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.core.ReturnInstruction.Return;

public class ProductListPage extends BaseClass{
	
	public ProductListPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'col-7-12')]//div[not(*)]")
	public  List<WebElement> allProductsinPage;
	
	
	

}
