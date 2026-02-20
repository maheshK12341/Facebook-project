package StepDefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginpage;
import GenericMethods.GenericMethodsC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginStepdefination  extends loginpage
{

@Given("user is on  login page")
public static void user_is_on_login_page() throws IOException, InterruptedException
{
	
	browserInitzation();
	ExtentCucumberAdapter.addTestStepLog("application is launched successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodsC.captureScreenShot());
}
@When("user enters valid username {string}")	
public static void userentersvalidusername(String emailid) throws IOException
{
	EnterEmailID(emailid);
	ExtentCucumberAdapter.addTestStepLog("user entered the email id successfully  "+ emailid);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodsC.captureScreenShot());
}


@When("^user enters valid usernameM \"([^\"]*)\"$")
public static void userentersvalidusernameM(String emailid) throws IOException, InterruptedException
{
	Thread.sleep(3000);
	EnterEmailID(emailid);
	ExtentCucumberAdapter.addTestStepLog("user entered the email id successfully  "+ emailid);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodsC.captureScreenShot());
}
@And("^user enters valid passwordM \"([^\"]*)\"$")
public static void user_enters_valid_passwordM(String password) throws IOException
{
	Enterpassword(password);
	ExtentCucumberAdapter.addTestStepLog("user entered the password  successfully  "+ password);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodsC.captureScreenShot());
}





@And("user enters valid password {string}")
public static void userentersvalidpassword(String password) throws IOException
{
	Enterpassword(password);
	ExtentCucumberAdapter.addTestStepLog("user entered the password  successfully  "+ password);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodsC.captureScreenShot());
}



@And("clicks on submit")
public static void clicksonsubmit()  throws IOException
{
	login();
	ExtentCucumberAdapter.addTestStepLog("login button is clicked successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodsC.captureScreenShot());
}
		
}
