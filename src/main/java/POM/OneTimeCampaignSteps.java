package POM;

import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Locators;
import utilities.SeleniumActions;

import static utilities.SeleniumBase.wait;

public class OneTimeCampaignSteps {
    //<<<<step1>>>>
    public void chooseCampaignTemplate() throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
        seleniumActions.hoverOnElement(locators.hoverCampaignTemplate);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.previewButton));
        seleniumActions.click(locators.previewButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.closePreview));
        seleniumActions.click(locators.closePreview);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.hoverCampaignTemplate));
        seleniumActions.hoverOnElement(locators.hoverCampaignTemplate);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.useTemplateButton));
        seleniumActions.click(locators.useTemplateButton);
    }

    //<<<<step2>>>>
    public void createCampaignSettings(String CampaignName, String SubjectLine, String SegmentSearch, String ProductSetSearch, String Product1, String Product2, String Product3) throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();
        // Thread.sleep(20000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.campaignName));
        seleniumActions.clear(locators.campaignName);
        seleniumActions.sendKeys(locators.campaignName, CampaignName);
        seleniumActions.clear(locators.subjectLine);
        seleniumActions.sendKeys(locators.subjectLine, SubjectLine);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.segmentLookup));
        seleniumActions.click(locators.segmentLookup);
        seleniumActions.sendKeys(locators.segmentSearch, SegmentSearch);
        seleniumActions.click(locators.segmentSelection);
        seleniumActions.click(locators.productSetLookup);
        seleniumActions.sendKeys(locators.productSetSearch, ProductSetSearch);
        seleniumActions.click(locators.productSetSelection);

        seleniumActions.click(locators.chooseProduct);

        String[] products = {Product1, Product2, Product3};

        for (int i = 1; i < products.length; i++) {
            seleniumActions.clear(locators.searchForProduct);
            seleniumActions.sendKeys(locators.searchForProduct, products[i]);
            seleniumActions.click(locators.selectProducts);

        }
        seleniumActions.clear(locators.searchForProduct);
        seleniumActions.click(locators.addProductButton);
        seleniumActions.click(locators.oneTimeNextButton);

    }

    //<<<<step3>>>>

    public void customizeYourDesign() throws InterruptedException {
        SeleniumActions seleniumActions = new SeleniumActions();
        Locators locators = new Locators();

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.closePopUp));
        seleniumActions.click(locators.closePopUp);
        seleniumActions.scroll(4000);

        seleniumActions.click(locators.oneTimeNextButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.assertReviewStep));
    }


}
