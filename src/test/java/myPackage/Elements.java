package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

    public WebElement googleSearchField(ChromeDriver browser) {
        WebElement element = browser.findElement(By.name("q"));
        return element;
    }

}
