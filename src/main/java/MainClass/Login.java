package MainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
		@FindBy(id = "userEmail")
	WebElement email;
	@FindBy(id = "userPassword")
	WebElement pass;
	@FindBy(id = "login")
	WebElement submit;
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);}
	public void launchurl() {
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");}
	public void login(String userid, String userpass) {
		email.sendKeys(userid);
		pass.sendKeys(userpass);
		submit.click();}
	public void verifyDashboard() {
		String expectedurl = "https://rahulshettyacademy.com/client/#/dashboard/dash";
		String actualurl = driver.getCurrentUrl();
		if(expectedurl.equals(actualurl)) {
			System.out.println("correct home page display");}
		else {
			System.out.println("Incorrect home page dispaly");
			System.out.println(actualurl);}}
	public void browserquit() {
		driver.quit();}}
