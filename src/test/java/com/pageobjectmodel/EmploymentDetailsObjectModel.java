package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.Base_Class;
import com.interfaceelements.EmploymentDetails;

public class EmploymentDetailsObjectModel extends Base_Class implements EmploymentDetails{
	
	
	@FindBy (id=clickaddemp_id)
	private WebElement clickaddemp;
	
	
	@FindBy (xpath=radio_xpath)
	private WebElement radio;
	
	@FindBy (xpath=radio1_xpath)
	private WebElement radio1;
	
	@FindBy (xpath=years_xpath)
	private WebElement years;
	
	@FindBy (id=currentcompany_id)
	private WebElement currentcompany;
	
	@FindBy (id=designation_id)
	private WebElement designation;
	
	@FindBy (xpath=joindate_xpath)
	private WebElement joindate;
	
	@FindBy (id=salary_id)
	private WebElement salary;
	
	@FindBy (id=keyskill_id)
	private WebElement keyskill;
	
	@FindBy (id=jobprofile_id)
	private WebElement jobprofile;
	

	@FindBy (id=notice_id)
	private WebElement notice;
	
	@FindBy (id=submit_id)
	private WebElement submit;
	
	public void EmploymentDetailsObjectModel() {
		
		clickElement(clickaddemp);
		clickElement(radio);
		clickElement(radio1);
        selectOptions(years,"text","3 Years");	
        //passInput(currentcompany,);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
