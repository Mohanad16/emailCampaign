package POM;

import utilities.Locators;
import utilities.SeleniumActions;
import utilities.SeleniumBase;

public class SignInPage extends SeleniumBase {

    public void loginPage(String Email, String Password) throws InterruptedException {
        Locators locators = new Locators();
        SeleniumActions actions = new SeleniumActions();
        actions.clear(locators.loginEmail);
        actions.sendKeys(locators.loginEmail, Email);
        actions.clear(locators.loginPassword);
        actions.sendKeys(locators.loginPassword, Password);
        actions.click(locators.loginButton);

    }


}
