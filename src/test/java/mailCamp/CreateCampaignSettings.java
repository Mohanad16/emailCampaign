package mailCamp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CreateCampaignSettings {
    static WebDriver driver;




    public void openURL() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://app-stg.converted.in/");


        WebElement mail = driver.findElement(By.id("email"));


        mail.sendKeys("mckenzie.lincoln@yahoo.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);


        driver.navigate().to("https://app-stg.converted.in/dashboard/campaigns/email/one-time-campaign/initialize/13/campaign");
        Thread.sleep(5000);

    }

    public void mailName (){
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.clear();
        name.sendKeys("new name");
       String campaignName= name.getAttribute("placeholder");
        System.out.println(campaignName);

    }

    public void mailSubject(){
        WebElement sub = driver.findElement(By.xpath("//input[@name='subject']"));
        sub.clear();
        sub.sendKeys("New Discount");
        String subjectLine = sub.getAttribute("placeholder");
        System.out.println(subjectLine);
    }

    public void mailSegment() throws InterruptedException {

        Thread.sleep(2000);
        WebElement lookup = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]"));
        lookup.click();

        WebElement segmentSearch = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        segmentSearch.sendKeys("all customer");

        WebElement segment = driver.findElement(By.xpath("//li[@role='option']"));
        segment.click();
       // Thread.sleep(5000);
        //WebElement chooseSeg = driver.findElement(By.xpath("//li[@role='option'][1]"));
        //chooseSeg.click();
    }

    public void mailProducts() throws InterruptedException {
        //Select product set
        WebElement productSet = driver.findElement(By.xpath("//*[@id='select2-productSets-container']"));
        productSet.click();
        WebElement productSearch=driver.findElement(By.xpath("//*[@aria-controls='select2-productSets-results']"));
        productSearch.sendKeys("New Items This Month");

        Thread.sleep(2000);
        WebElement product = driver.findElement(By.xpath("//li[@role='option'][1]"));
        product.click();

        //Choose products
        WebElement chooseProduct = driver.findElement(By.xpath("//button[@class='toggle-popup choose-products-action']"));
        chooseProduct.click();
        Thread.sleep(5000);
        WebElement firstProduct = driver.findElement(By.xpath("(//label[@class='form-check-label stretched-link'])[1]"));
        firstProduct.click();
        WebElement secondProduct = driver.findElement(By.xpath("(//label[@class='form-check-label stretched-link'])[2]"));
        secondProduct.click();
        WebElement thirdProduct = driver.findElement(By.xpath("(//label[@class='form-check-label stretched-link'])[3]"));
        thirdProduct.click();

        WebElement addProduct = driver.findElement(By.xpath("(//button[@data-popuptarget='multi-select-product-popup'])[3]"));
        addProduct.click();


    }

    public void goToPage () throws InterruptedException {

        WebElement next1 = driver.findElement(By.id("next"));
        next1.click();

Thread.sleep(5000);
        WebElement close = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        close.click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4200)", "");

Thread.sleep(1000);
        WebElement next2 = driver.findElement(By.xpath("(//button[@class='page-action-button'])[2]"));

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.elementToBeClickable(next2));

        next2.click();

    }

public void assertTrue(){

        WebElement assertName = driver.findElement(By.xpath("(//*[@class='pl-5'])[1]"));
        String  nameText = assertName.getText();
        Assert.assertEquals(nameText,"new name","Campain name is match");

    WebElement assertsub = driver.findElement(By.xpath("(//td[@class='pl-5'])[2]"));
    String  subText = assertsub.getText();
    Assert.assertEquals(subText,"New Discount","Campain name is match");

   WebElement assertSegment = driver.findElement(By.xpath("(//td[@class='pl-5'])[3]"));
    String  segText = assertSegment.getText();
    Assert.assertEquals(segText,"All Customers","Campain name is match");

    WebElement assertProduct = driver.findElement(By.xpath("(//td[@class='pl-5'])[4]"));
    String  proText = assertProduct.getText();
    Assert.assertTrue(proText.contains("Defrost Express "));
}

}


////li[@role='option'][1]