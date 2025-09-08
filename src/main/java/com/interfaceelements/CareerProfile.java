package com.interfaceelements;

public interface CareerProfile {
	
	String careericon_xpath="(//span[text()='editOneTheme'])[11]";
	String crntindus_xpath="//a[@data-id='industry_109_ITSxPServices']";
	String department_xpath="//a[@data-id='fareaDroope_5']";
	String rollcat_xpath="//a[@data-id='roleCategoryDroope_1027']";
	String jobroll_xpath="//a[@data-id='roleDroope_235']";
	String jobtype_xpath="//label[@for='permanent']";
	String employmenttype_xpath="//label[@for='fullTime']";
	String shifttyperadio_id="day_shift";
	String expectsalary_xpath="//input[@placeholder='Eg. 4,50,000']";
	String savecareer_id="saveDesiredProfile";

}
