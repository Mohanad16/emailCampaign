package POM;

import utilities.Locators;
import utilities.SeleniumActions;

public class CreateCampaigns {

    public void oneTimeCampaign() throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        seleniumActions.click(locators.oneTimeNextButton);
        seleniumActions.click(locators.templateGroups);
        seleniumActions.hoverOnElement(locators.hoverOnTemplate);
        seleniumActions.click(locators.selectTemplate);


    }

}
