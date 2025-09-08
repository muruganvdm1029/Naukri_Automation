package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ProfileUpdate;

public final class Naukri_Profileupdate extends Base_Class implements ProfileUpdate {

	@FindBy(xpath = userprofile_xpath)
	private WebElement userprofile;

	@FindBy(xpath = viewupdate_xpath)
	private WebElement viewupdate;

	public Naukri_Profileupdate() {
		PageFactory.initElements(driver, this);
	}

	public void userprofile() throws IOException {
		//alerts("dismiss", null);

		clickElement(userprofile);
		clickElement(viewupdate);

	}

}
