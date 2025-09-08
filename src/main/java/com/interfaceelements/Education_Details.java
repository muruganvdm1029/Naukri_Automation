package com.interfaceelements;

public interface Education_Details {
	
	
	String addedu_xpath="//span[text()='Add education']";
	String clickedu_xpath="//input[@placeholder='Select education']";
	String seldegree_xpath="//a[@data-id='highEdu_1']";
	String clickuniv_id="institute";
	String seluniv_xpath="(//div[text()='Anna University'])[1]";
	String clickcourse_xpath="//input[@placeholder='Select course']";
	String selcourse_xpath="//a[@data-id='crs_12']";
	String clickdiscipline_id="specializationFor";
	String seldiscipline_xpath="//a[@data-id='specialization_16']";
	String fulltime_xpath="//label[@for='full_time']";
	String courseclick_id="yosFieldFor";
	String coursestart_xpath="//a[@data-id='yosField_2016']";
	String clickend_id="yopFieldFor";
	//String courseend_xpath="//a[@data-id='yopField_2019']";
	String clickgrade_id="gradeFieldFor";
	String selgrade_xpath="//a[@data-id='gradeField_1']";
	String clickmarks_id="gradeMarks";
	String save_id="saveEducation";
	
	

}
