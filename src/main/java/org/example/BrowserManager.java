package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
//Browser related all the Methods to be stored here
public class BrowserManager extends Utility
{
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");
    //multi-browser method created
    public void openBrowser()
    {

        if (browser.equalsIgnoreCase("chrome"))
        {   ChromeOptions option = new ChromeOptions();
            Map<String, Object> settings = new HashMap<String, Object>();
            settings.put("autofill.profile_enabled", false);
            option.setExperimentalOption("prefs", settings);
            driver=new ChromeDriver(option);

          //  driver = new ChromeDriver();
            System.out.println(loadProp.getProperty("browserName1"));

        } else if (browser.equalsIgnoreCase("firefox"))
        {driver = new FirefoxDriver();
            System.out.println(loadProp.getProperty("browserName2"));
        } else if (browser.equalsIgnoreCase("edge"))
        {driver = new EdgeDriver();
            System.out.println(loadProp.getProperty("browserName3"));
        } else {
            System.out.println(loadProp.getProperty("wrongBrowserMessage") + browser);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(loadProp.getProperty("url"));

    }
    public void closeBrowser()
    //method to quit the browser
    {
        driver.quit();
    }
}