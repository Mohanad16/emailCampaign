package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions extends SeleniumBase {

    public void click(By path) throws InterruptedException {
        Thread.sleep(500);
        WebElement ClickButton = driver.findElement(path);
        ClickButton.click();

    }

    public void clear(By path) throws InterruptedException {
        Thread.sleep(500);
        WebElement ClearText = driver.findElement(path);
        ClearText.clear();

    }

    public void sendKeys(By path, String value) throws InterruptedException {
        Thread.sleep(500);
        WebElement SendText = driver.findElement(path);
        SendText.sendKeys(value);

    }

    public String getText(By path) throws InterruptedException {
        Thread.sleep(200);
        WebElement GetText = driver.findElement(path);
        return GetText.getText();

    }


    public void scroll(int scrollHeight) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, arguments[0])", scrollHeight);

    }

    public void hoverOnElement (By path) throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(500);
        WebElement Hover = driver.findElement(path);
        actions.moveToElement(Hover).perform();

    }

}
