package uiAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo implements Common{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .contextClick()
                .build();

        seriesOfActions.perform() ;
        Thread.sleep(3000);
        driver.quit();
        //List of all action class
        String actionNames[] = {"build", "click", "clickAndHold", "contextClick", "doubleClick", "dragAndDrop", "dragAndDropBy", "keyDown", "keyUp", "moveByOffset", "moveToElement", "pause", "perform", "release", "sendKeys", "tick"};
        for (String name : actionNames){System.out.println(name);}
    }
}
