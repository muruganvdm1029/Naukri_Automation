package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ResumeHeadline;

public class ResumeHeadlineObjectModel extends Base_Class implements ResumeHeadline{
	
	
	@FindBy(xpath=clickresumehead_xpath)
	private WebElement editresumehead;
	
	@FindBy(id=headline_id)
	private WebElement headline;
	
	@FindBy(xpath=save_xpath)
	private WebElement save;
	
	public ResumeHeadlineObjectModel() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void ResumeHeadline() {
		
		clickElement(editresumehead);
		
		
	}
	

}
