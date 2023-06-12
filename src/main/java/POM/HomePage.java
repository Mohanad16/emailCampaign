package POM;

import utilities.Locators;
import utilities.SeleniumActions;



public class HomePage {

    public void EmailCampaign () throws InterruptedException {

        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        seleniumActions.click(locators.emailCampaignsLookup);
        seleniumActions.click(locators.createEmailCampaign);


    }



}
