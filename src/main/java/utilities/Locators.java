package utilities;

import org.openqa.selenium.By;

public class Locators {


    //<<<< Login >>>>
    public By loginEmail = By.id("email");
    public By loginPassword = By.id("password");
    public By loginButton = By.xpath("//button[@type='submit']");


    //steps from home page to first step in one-time campaign

    public By emailCampaignsLookup = By.xpath("//div[@class='main-sidebar-menu']/ul/li[7]/a/span");
    public By createEmailCampaign = By.xpath("(//a[@class='sub-item-action'])[16]");
    public By oneTimeNextButton = By.xpath("//button[text()='Next']");
    public By templateGroups = By.xpath("//div[@data-group-id='all']");
    public By hoverOnTemplate = By.xpath("//div[@data-template-type='83']");
    public By selectTemplate = By.xpath("//*[@data-template-type='83']//button[text()='Select']");

    //steps to go inside chosen template

    public By assertOneTimeCampaign = By.xpath("//*[text()='Shopping Season Back To School']");
    //locators chooseCampaignTemplate
    public By hoverCampaignTemplate = By.xpath("//div[@class='handover-media']");
    public By previewButton = By.xpath("//button[@class='preview-btn']");
    public By closePreview = By.xpath("//button[@class='btn btn-secondary']");
    public By useTemplateButton = By.xpath("//button[@class='use-template-btn']");
    public By assertCampaignDetails = By.xpath("//*[text()='Defualt Template Preview']");

    //<<<<Choose Campaign Template (Step2)>>>>
    public By campaignName = By.xpath("//input[@name='name']");
    public By subjectLine = By.xpath("//input[@name='subject']");
    public By segmentLookup = By.xpath("//*[@id='select2-segment-container']");
    public By segmentSearch = By.xpath("//*[@aria-label='Search']");
    public By segmentSelection = By.xpath("//li[@role='option'][1]");
    public By productSetLookup = By.xpath("//*[@id='select2-productSets-container']");
    public By productSetSearch = By.xpath("//*[@aria-controls='select2-productSets-results']");
    public By productSetSelection = By.xpath("//li[@role='option'][1]");


   // choose from product

    public By chooseProduct = By.xpath("(//button[@data-popuptarget='multi-select-product-popup'])[1]");
    public By searchForProduct = By.name("SearchDualList");
    public By selectProducts = By.xpath("(//label[@class='form-check-label stretched-link'])[1]");
    public By addProductButton = By.xpath("(//*[@data-popuptarget='multi-select-product-popup'])[3]");


    // <<<<Customize Your Design (step3)>>>>
    public By closePopUp = By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; hideOnBoarding()']");



    //<<<<Review & Send (Step4)>>>>
    public By assertReviewStep = By.xpath("//h2[@class='my-5']");
    public By campaignNameCheck = By.xpath("(//*[@class='pl-5'])[1]");
    public By subjectLineCheck = By.xpath("(//*[@class='pl-5'])[2]");
    public By segmentCheck = By.xpath("(//*[@class='pl-5'])[3]");
    public By productsCheck = By.xpath("(//*[@class='pl-5'])[4]");

    public By assertHomepage = By.className("campaign-item-title");
    public By assertLogin = By.xpath("//a[@id='contact_support']");
}
