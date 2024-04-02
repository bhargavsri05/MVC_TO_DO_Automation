package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = "C://Users//Bhargav//Pictures//MVC_TO_DO_Automation//src//test//java//com//FeatureTODO//UserToDo.feature",
	    glue = "stepDefinitions")

public class TestRunner {

}
