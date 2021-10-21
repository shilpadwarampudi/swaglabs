package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)//ctrl+shift+(alphabet o) to import packages

@io.cucumber.junit.CucumberOptions
  (
		  features=".//Features/Login.feature",//specify the location of the feature file
			glue="stepDefinitions",//
			//dryRun=true,//for every step in feature,It checks if corresponding stepdefinition file is implemented
			dryRun=false,//run the testrunner file for dryRun=false after stepdefinitions are all created.
			monochrome=true,//removes unnecessary characters from console window
			plugin= {"pretty","html:test-output"}//prints output in the console window	//html report is generated.
	)
 public class testRun 
 {
 }
