package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

import MainClass.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public WebDriver driver;
	
	public ExtentReports extent;
	
	@BeforeClass
	public void extentReportSetup() {
		//String path = System.getProperty("user.dir")+"\\src\\ExtentReport\\index.html";
		String path = "C:\\Users\\Rajan\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\ExtentReports\\index.html";
		System.out.println(path);
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		ExtentSparkReporterConfig setting = spark.config();
		setting.setReportName("New HTML Report");
		setting.setDocumentTitle("Automation HTML Report");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Tester", "Rajan KUmar");
			
	}
	
	@BeforeMethod
	public void browserOpening() {
		String browser = System.getProperty("browserName");
		ChromeOptions coptions = new ChromeOptions();//for chrome only
		coptions.addArguments("--headless");
		
		coptions.addArguments("--window-size=1920,1080");
		if(browser.equals("chrome")) {
			driver = new ChromeDriver(coptions);
			
		}
		else if (browser.equals("firefox")) {
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.addArguments("-headless");//set for firefox
	        driver = new FirefoxDriver(foptions);
	    }
	}
	
	@Test
	public  void test1() {
		ExtentTest test = extent.createTest("Testing Demo");
		test.pass("pass the testing");
		
		
		Login lp = new Login(driver);
		lp.launchurl();
		lp.login("odoo1312@gmail.com", "Rr@11007096");
		lp.verifyDashboard();
		lp.browserquit();
		extent.flush();
		
	}
	
}
