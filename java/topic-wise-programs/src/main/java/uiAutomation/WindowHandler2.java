package uiAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class WindowHandler2 implements Common{
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://facebook.com");
        String parentTab = driver.getWindowHandle();

        // using action class
        //Actions openNewTab = new Actions(driver);
        //openNewTab.sendKeys(Keys.chord(Keys.CONTROL, "t")).build().perform();

        //using javascript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://google.com','_blank');");

        Set<String> tabs = driver.getWindowHandles();

        for (String tab : tabs){
            if (!tab.equals(parentTab)){
                driver.switchTo().window(tab);
                Thread.sleep(3000);
            }
        }

        WebElement searchInput = driver.findElement(By.xpath("//input[@title='Search']"));
        searchInput.sendKeys("example.com");

        Actions hitEnter = new Actions(driver);
        hitEnter.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
