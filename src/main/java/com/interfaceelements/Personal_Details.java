package com.interfaceelements;

public interface Personal_Details {
	
	String personalicon_xpath="(//span[text()='editOneTheme'])[12]";
	
	String gender_id="gender_Male_male";
	
	String maritalstatus_id="maritalStatus_Single/unmarried_N";
	
	String date_xpath="//a[@data-id='pd-date_9']";
	
	String month_xpath="//a[@data-id='pd-month_6']";
	
	String year_xpath="//a[@data-id='pd-year_1997']";
	
	String obc_xpath="//label[@for='category_OBC - Non creamy_5']";
	
	String physical_id="challenged-no";
	
	String break_xpath="//label[@for='cb-no']";
	
	String address_id="pd-permanent-address" ;
	
	String hometown_id="pd-hometown";
	
	String pincode_id="pd-pincode";
	
	String clicklang_id="pd-language--0For";
	
	String selecteng_xpath="//a[@data-id='pd-language--0_1']";
	
	String engprofi_id="pd-proficiency-0For";
	
	String selectengpro_xpath="//a[@data-id='pd-proficiency-0_2']";
	
	String engreadcbox_xpath="//label[@for='pd-ability-read-0']";
	String engwritecbox_xpath="//label[@for='pd-ability-write-0']";
	String engspeakcbox_xpath="//label[@for='pd-ability-write-0']";
	
	String clicktamil_id="pd-language--1For";
	String selecttamil_xpath="//a[@data-id='pd-language--1_11']";
	
	String clicktamilpro_id="pd-proficiency-1For";
	String selecttamilpro_path="//a[@data-id='pd-proficiency-1_3']";
	
	String tamilreadcbox_xpath="//label[@for='pd-ability-read-1']";
	String tamilwritecbox_xpath="//label[@for='pd-ability-write-1']";
	String tamilspeakcbox_xpath="//label[@for='pd-ability-speak-1']";
	String savepersonaldetails_id="savePersonalDetailsBtn";

}
