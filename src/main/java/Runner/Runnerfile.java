package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


		@CucumberOptions(features = {"features/login.feature"},// path of feature
        glue =     {"StepDefination"},//path of stepdefinations
        		 plugin =    { "pretty","html:target/cucumber-reports",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		     "rerun:target/failedrerun.txt"},
       	tags="@smoke",
         monochrome = true 
)

public class Runnerfile extends AbstractTestNGCucumberTests
{
	
	}