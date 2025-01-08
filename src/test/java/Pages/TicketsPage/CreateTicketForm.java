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
    By TextDetails = By.id("rteBody");
    By Address = By.id("CustomFieldValue28");
    By SubmitButton = By.id("btnAdd");
    By TakeOverButton = By.xpath("//*[@id=\"status\"]/li[2]/form/input");
    public void TakeOverAction(){
        assertion.assertElementIsDisplayed(TakeOverButton);
    }
    public void SelectCategory(){
        browserActions.click(CategoryField);
        browserActions.click(CategorySelection);
    }
    public void EnterSubject(){
        browserActions.type(subject, "sub");
    }
    public void EnterDetails(String details){
        browserActions.type(TextDetails, details);
    }
    public void EnterAddress(String address){
        browserActions.type(Address,  address);
    }
    public void ClickSubmitButton(){
        browserActions.click(SubmitButton);
    }

}
