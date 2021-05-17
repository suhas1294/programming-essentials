package uiAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class ContextClickDemo implements Common {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        //Launch the Application Under Test (AUT)
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

        // Right click the button to launch right click menu options
        Actions action = new Actions(driver);

        WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
        action.contextClick(link).perform();

        // Click on Edit link on the displayed menu options
        WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        element.click();

        // Accept the alert displayed
        driver.switchTo().alert().accept();

        driver.navigate().to("https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html");
        List<WebElement> actionElements = new ArrayList();
        List<String> allActionNames = new ArrayList();
        actionElements = driver.findElements(By.className("memberNameLink"));
        for (WebElement webElement: actionElements){
            allActionNames.add(webElement.getText());
        }

        System.out.println(allActionNames);
        driver.quit();

    }
}