package uiAutomation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenshotDemo implements Common {

    public static void main(String args[]) throws Exception {

        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/V4/");
        takeSnapShot(driver, "screenshots/test.png");
        Thread.sleep(3000);
        driver.quit();
    }

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }
}