package com.qa.googletest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class OpenGoogleTest {

    // Instance of WebDriver
    private WebDriver driver;

    /**
     * Set up method
     */
    @Before
    public void setUp() {

        // If you want to disable infobars please use this code
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        // Initialize path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Initialize instance of ChromeDriver and add options
        driver = new ChromeDriver(options);

        // Set 10 second for implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Maximize window
        driver.manage().window().maximize();


    }

    /**
     * Open Google page, search and quit
     */
    @Test
    public void testOpenGoogleTest() {

        // Open Google
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://google.com.ua");

        // Send phrase in search input
        driver.findElement(By.name("q")).sendKeys("Automation testing");
        driver.findElement(By.name("q")).submit();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");



        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(@href,'https://www.qasymphony.com')]//span[contains(@class,'S3Uucc')]"))));
        System.out.println("test");

       // driver.findElement(By.xpath("//a[contains(@href,'https://www.qasymphony.com')]")).click();
    }

    /**
     * After method, quit driver
     */
   /** @After
    public void tearDown() {

        // Quit from Driver. close() just close window,
        // quit() - close all window an driver
        driver.quit();
    }*/

}
