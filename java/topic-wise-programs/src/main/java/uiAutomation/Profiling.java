package uiAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Profiling {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/johndoe/workspace/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://localhost:9090/index.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long domLoadingStart = (Long) js.executeScript("return(window.performance.timing.loadEventEnd - window.performance.timing.domLoading)");
        driver.quit();
    }
}
