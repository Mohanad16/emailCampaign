package mailCamp;

import POM.CreateCampaigns;
import POM.HomePage;
import POM.OneTimeCampaignSteps;
import POM.SignInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Locators;
import utilities.SeleniumActions;
import utilities.SeleniumBase;


public class RUN {
    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig("https://app-stg.converted.in/login");
    }

    //test and assert that login is working
    @Test(priority = 1)
    public void login() throws InterruptedException {
        SignInPage signInPage = new SignInPage();
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
        Assert.assertEquals(actions.getText(locators.assertLogin), "Contact Support");
        //Assert.assertEquals(signInPage.assertionLogin(),"Contact Support");
    }

    @Test(priority = 2)
    public void homePage() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        HomePage home = new HomePage();
        home.EmailCampaign();
        Assert.assertEquals(actions.getText(locators.assertHomepage), "One Time Campaign");
    }

    @Test(priority = 3)
    public void selectOneTimeCampaign() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        CreateCampaigns oneTime = new CreateCampaigns();
        oneTime.oneTimeCampaign();
        Assert.assertEquals(actions.getText(locators.assertOneTimeCampaign), "Shopping Season Back To School");
    }

    @Test(priority = 4)
    public void chooseCampaignTemplate() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        steps.chooseCampaignTemplate();
        Assert.assertEquals(actions.getText(locators.assertCampaignDetails), "Defualt Template Preview");
    }

    @Test(priority = 5)
    public void createCampaignSettings() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        steps.createCampaignSettings("campaign1", "subject1", "all", "new", "test", "star", "sunglasses");
        // Assert.assertEquals(actions.getText(locators.assertPreviewTemplate),"");
    }

    @Test(priority = 6)
    public void customizeYourDesign() throws InterruptedException {
        OneTimeCampaignSteps steps = new OneTimeCampaignSteps();
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        steps.customizeYourDesign();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertReviewStep));
        Assert.assertEquals(actions.getText(locators.assertReviewStep), "Campaign Content");
    }

    @Test(priority = 7)
    public void reviewAndSend() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators locators = new Locators();
        Assert.assertEquals(actions.getText(locators.campaignNameCheck), "campaign1");
        Assert.assertEquals(actions.getText(locators.subjectLineCheck), "subject1");
        Assert.assertEquals(actions.getText(locators.segmentCheck), "All Customers");
        Assert.assertTrue(actions.getText(locators.productsCheck).contains("Sunglasses"));
    }

}











