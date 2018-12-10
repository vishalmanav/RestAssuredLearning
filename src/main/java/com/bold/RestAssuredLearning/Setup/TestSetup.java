package com.bold.RestAssuredLearning.Setup;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.bold.RestAssuredLearning.TestUtils.ExcelReader;

public class TestSetup {

	
	ExcelReader excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\TestData.xlsx");
	
	
	
	@BeforeSuite
	public void setUp()
	{
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		
	}
	
	@AfterClass
	public void afterClass()
	{
		
	}
	
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		System.out.println("Execution of Method : "+ method.getName()+ " started.");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
	
	
	@AfterTest
	public void afterTest()
	{
		
	}
	
	
	
	@AfterSuite	
	public void tearDown()
	{
		
	}
	
	
}
