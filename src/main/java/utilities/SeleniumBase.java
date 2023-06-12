package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumBase {

    public static WebDriver driver;
  public   static WebDriverWait wait;

    public WebDriver seleniumConfig(String baseURL) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().getPageLoadTimeout();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return driver;


    }


}
