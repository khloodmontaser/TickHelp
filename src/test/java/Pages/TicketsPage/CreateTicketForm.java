package Pages.TicketsPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTicketForm {
    BrowserActions browserActions;
    Assertion assertion;
    public CreateTicketForm(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By CategoryField = By.xpath("//*[@id=\"CategoryRow\"]/td[1]/div/a/i");
    By CategorySelection = By.xpath("//li[@class='dropdown-item']//span[@class='dropdown-text' and text()='Anderson']\n");
    By subject = By.id("Subject");
    By TextDetails = By.xpath("//*[@id='rteBody']");
    By Address = By.id("CustomFieldValue28");
    By advancedButton =By.id("lnkAdvanced");
    By tagField= By.id("Tags_tag");
    By SubmitButton = By.id("btnAdd");
    By TakeOverButton = By.id("CategoryID-error");
    By GuestEmail = By.id("YourEmail");


    public void validatemsg(){
        assertion.assertElementIsDisplayed(TakeOverButton);
    }
    public void ClickCatrgory(){
        browserActions.click(CategoryField);

    }
    public void SelectCategory(){
        browserActions.click(CategorySelection);
    }
    public void EnterSubject(String sub ){
        browserActions.type(subject, sub);
    }
    public void EnterDetails(String details){
        browserActions.click(TextDetails);
        browserActions.type(TextDetails, details);
    }
    public void EnterAddress(String address){
        browserActions.type(Address,  address);
    }
    public void ClickAdvancedButton(){browserActions.click(advancedButton);}
    public void ClickSubmitButton(){

        browserActions.click(SubmitButton);
    }
    public void EnterTag(){
        browserActions.type(tagField, "AutomatedTag");
    }
    public void EnterGuestMail(String GuestMail){
        browserActions.type(GuestEmail,GuestMail );
    }

}
