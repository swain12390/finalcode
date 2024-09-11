package StepDefinitionspackage;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;


import GeneriMethods.GenericMethods;

import Pagepackage.PageLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends PageLogin

{
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException 
	{
		application_launch();
		ExtentCucumberAdapter.addTestStepLog("application lanuch is done");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.captureScreenShot());
		
	}
	
	@When("^user enters valid  username\"([^\"]*)\"$")
	public void user_enters_valid_username(String emailid) throws IOException
	{
		Enter_Emailid(emailid);
		ExtentCucumberAdapter.addTestStepLog("User entered the email"+emailid);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.captureScreenShot());
	}
	@When("^user enters valid password \"([^\"]*)\"$")
	public void user_enters_valid_password(String pass) throws IOException {
		Enter_password(pass);
		ExtentCucumberAdapter.addTestStepLog("User entered the password"+pass);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.captureScreenShot());
	}
	
	
	
	
	
	
	

	
	
//	@When("user enters valid username {string}")
//	public void user_enters_valid_username(String emailid)
//	{
//		Enter_Emailid(emailid);
//	}
//	@When("user enters valid password {string}")
//	public void user_enters_valid_password(String pass) {
//		Enter_password(pass);
//	}
	
	@Then("clicks on submit button")
	public void clicks_on_submit_button() 
	{
		Login();
	}
	
}
