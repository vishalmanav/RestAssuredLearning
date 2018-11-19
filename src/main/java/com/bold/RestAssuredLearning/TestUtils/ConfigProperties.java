package com.bold.RestAssuredLearning.TestUtils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;
import org.aeonbits.owner.Config.Sources;





@Sources({ "file:src\\test\\resources\\propertyFiles\\${environment}.properties"})


public interface ConfigProperties extends Config {
	
	
	@Key("baseURI")
	String getBaseURI();
	
	@Key("basePath")
	String getBasePath();
	
	

}
