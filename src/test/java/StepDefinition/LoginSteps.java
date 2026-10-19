package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MainClass.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
public WebDriver driver;
public Login lp;
@Given("the user opens the login page where username, password and submit button are displayed")
public void openLoginPage() {
	driver = new ChromeDriver();
	lp = new Login(driver);
	lp.launchurl();}
@When("the user enters username,password and clicks on the Submit button")
public void enterusernameAndpasswordAndclicksSubmit() {
	lp.login("odoo1312@gmail.com", "Rr@11007096");}
@Then("the user should successfully log in to the home page")
public void verifyHomePage() {
	lp.verifyDashboard();}
@And("the browser should close")
public void closeBrowser() {
	System.out.println("Rajan Kumar Testing1");
	lp.browserquit();}}