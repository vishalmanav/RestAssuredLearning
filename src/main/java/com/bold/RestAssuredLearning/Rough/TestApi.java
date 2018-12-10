package com.bold.RestAssuredLearning.Rough;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.lang.reflect.Method;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bold.RestAssuredLearning.TestUtils.ConfigProperties;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestApi {

	public static ConfigProperties testEnvironment;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		
		//System.out.println("Method Name --> "+method.getName() );
		
		ConfigFactory.setProperty("environment", "dev");
		//ConfigFactory.setProperty("environment", "stage");
		
		testEnvironment = ConfigFactory.create(ConfigProperties.class);
		
		
		System.out.println(testEnvironment.getBaseURI());
		System.out.println(testEnvironment.getBasePath());
		
		RestAssured.baseURI = testEnvironment.getBaseURI();
		RestAssured.basePath = testEnvironment.getBasePath();
		
				
	}
	
	@Test
	public void verifyCreateACustomer(){
			
		Response response = given().auth().basic("sk_test_1bJC3YWUUUipwxUS7IcS2Usr", "").formParam("email", "rahul@bold.com").formParam("description", "Added this first customer through Rest Assured")
		.post("/customers").then().extract().response();
		
		System.out.println(response.asString());
		System.out.println(response.statusCode());
	
	}

}