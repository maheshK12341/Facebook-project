package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


		@CucumberOptions(features = {"@target/failedrerun.txt"},// path of failed test cases
        glue =     {"StepDefination"},//path of stepdefinations
        		 plugin =    { "pretty","html:target/cucumber-reports",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		     "rerun:target/failedrerun.txt"},
       	tags="@smoke",
         monochrome = true 
)

public class Runnerfiled extends AbstractTestNGCucumberTests
{
	
	}