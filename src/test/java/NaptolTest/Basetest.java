package NaptolTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import NaptolPages.ConsumerElectronicsPage;
import NaptolPages.HomePage;
import Utils.ConfigReader;

public class Basetest {
    // WebDriver instance
    protected WebDriver driver;
    
    // Variables to store test data
    protected String productname;
    protected String pincode;
    protected String qty;
    protected String from;
    protected String to;
     protected String pname2;
    protected String pname3;
    protected String pname4;
    
    // Page object instances
    HomePage home;
    ConsumerElectronicsPage consumers;

    @BeforeTest
    public void setup() {
        // Initialize WebDriver (Chrome in this case)
        driver = new ChromeDriver();
        
        // Maximize browser window
        driver.manage().window().maximize();
        
        // Set implicit wait for WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to the URL specified in the config file
        driver.get(ConfigReader.getProperty("url"));
        
        // Initialize test data variables from the config file
        productname = ConfigReader.getProperty("productname");
        pincode = ConfigReader.getProperty("pincode"); 
        qty = ConfigReader.getProperty("qty");
        from = ConfigReader.getProperty("from");
        to = ConfigReader.getProperty("to");
        pname2 = ConfigReader.getProperty("pname2");
        pname3 = ConfigReader.getProperty("pname3");
        pname4 = ConfigReader.getProperty("pname4");		
        
        // Initialize page objects
        home = new HomePage(driver);
        consumers = new ConsumerElectronicsPage(driver);
    }
    
    @AfterTest
    public void teardown() {
        // Close the browser and quit the WebDriver session
        driver.quit();
    }
}

