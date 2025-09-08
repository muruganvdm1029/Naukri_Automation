package com.runner;



import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.base.Base_Class;
import com.listener.ExtentReport_Test;
import com.listener.ITestListenerClass;
import com.utility.FileReaderManager;

import pageobjectmanager.PageObjectManager;
@Listeners(ITestListenerClass.class)
public class Naukri_Testng extends Base_Class{
	
    PageObjectManager pageObjectManager = new PageObjectManager();
	
	@BeforeTest
	private void propertySetUp() throws IOException {
	
	launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));
	launchUrl(pageObjectManager.getFileReader().getDataProperty("url"));
	
}

	@Test
	private void Login() throws Exception {
	ExtentReport_Test.Extenttest = extentReports.createTest("Login Test" + ":"+
	Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Login Test");
    assertTrue(pageObjectManager.getLoginpage().ValidLogin(ExtentReport_Test.Extenttest));		
		
		
	}
	
	@BeforeSuite
	private void extendStart() throws Exception {
         extentReportStart(pageObjectManager.getFileReader().getDataProperty("sourceReport"));
	}
	
	@AfterSuite
	private void extendEnd() throws Exception {
        extentReportTearDown(pageObjectManager.getFileReader().getDataProperty("destinationReport"));
        
	}
	@Test
	private void profile() throws IOException {
		pageObjectManager.getProfileupdate().userprofile();
	}

	

}
