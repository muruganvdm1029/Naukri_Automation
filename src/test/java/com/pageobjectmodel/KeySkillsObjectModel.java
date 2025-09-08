package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.KeySkills;

public class KeySkillsObjectModel extends Base_Class implements KeySkills {
	
	@FindBy(xpath=keyskills_xpath)
	private WebElement keyskills;
	
	@FindBy(xpath=clickskills_xpath)
	private WebElement clickskills;
	
	@FindBy(xpath=selectskill_xpath)
	private WebElement selectskill;
	
	
	
	@FindBy(id=saveb_id)
	private WebElement saveb;
	
	public KeySkillsObjectModel() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void KeySkills() {
		
		clickElement(keyskills);
		//clickElement(clickskill);
		//passinput
		//clickElement(selectskill);
		clickElement(saveb);
		
	}
	

}
