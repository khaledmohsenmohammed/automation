package app.robodeskautomation.StepDefs;

import app.robodeskautomation.configration.ConfigFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //String chromeDriverPath = System.getProperty("user.dir") + "\\java\\app\\robodeskautomation\\configration\\config.properties";
    String chromeDriverPath ="C:\\Users\\kmm_d\\IdeaProjects\\RobodeskAutomation\\src\\test\\java\\app\\robodeskautomation\\configration\\config.properties";

    public  static  ChromeDriver driver;
    public static String browser;
    public  static  String url;
    @Before
    public static void OpenBrowser() {  //1- Bridge
        ConfigFile.ReadPropertiesFile();
        if(browser.equals("chrome"))
        {
            driver = new ChromeDriver();
        }
        else {
            System.out.println("No browser");
        }
        // 3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);
        // 4- navigate to url
        System.out.println("***************"+url);
        driver.get(url);
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
