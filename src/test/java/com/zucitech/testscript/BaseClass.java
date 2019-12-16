package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected WebDriver driver;
    SelectorClass selector;
    @Parameters({"browser","url"})
    /*Initialize the browser*/
    @BeforeClass
    public void setUp(@Optional("chrome") String browser, @Optional("https://demoqa.com/") String url) {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver(); }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver(); }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
    /*Closing the browser*/
    @AfterClass
    public void terminate() {
        driver.quit();
    }
}
