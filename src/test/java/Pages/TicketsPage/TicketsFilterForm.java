package Pages.TicketsPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TicketsFilterForm {
    BrowserActions browserActions;
    Assertion assertion;
    public TicketsFilterForm(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By OpenFilter = By.id("toggleFilter");
    By Date = By.name("datePeriod");
    By ChosenPeriod = By.xpath("//option[@value='1']");
    By DueIn = By.name("dueFilter");
    By updated = By.name("updatedPeriod");
    By Status = By.xpath("//button[span[text()='Status']]");
    By ChosenStatus = By.xpath("//input[@value='2']");
    By priority = By.xpath("//button[span[text()='Priority']]");
    By ChosenPriority = By.xpath("//input[@value='0']");
    By FromUser_Email = By.id("fromUserId_txt");
    By Company = By.id("fromCompanyId_txt");
    By Department = By.id("fromDepartmentId");
    By Tech = By.xpath("//button/span[text()='Tech']");
    By UpdBy = By.xpath("//select[@name='badge']");
    By UpdByOptions = By.xpath("//option[text()='upd by tech']");
    //Buttons Locators
    By OnlyticketsSubscribedTo = By.xpath("//label[text()=\"Only tickets I'm subscribed to\"]");
    By SubmitButton = By.xpath("//*[@id=\"filterForm\"]/table/tbody/tr[14]/td/button");
    By SaveButton = By.id("btnSaveFilter");
    By RemoveFilter = By.id("btnResetFilter");
    By ChosenTech = By.id("//label[span[text()='client']]");

    //Ticket Page body
    By CreatedTicket = By.xpath("//*[@id=\"tblTickets\"]/tbody");
    By TicketCheckBox = By.xpath("//*[@id=\"ticketRow1117\"]/td[8]/label/input");
    By AllTicketCheck = By.id("cbDelAll");
    By DeleteBulk = By.xpath("//a[text()='Delete']");
    By DeleteTicket = By.xpath("//input[@title=\"Hint: try 'Shift+Click' to select ranges!\"]");

    //Tags
    By NewTag = By.xpath("//a[text()='automatedtag']");
    By TaggedTickets = By.xpath("//*[@id=\"tblTickets\"]/thead");

    //categories
    By CategoryAnderson = By.xpath("//*[@id=\"divCategories\"]/ul/ul/li[1]/a/span[1]");

    //Actions

    public void OpenFilter(){
        browserActions.click(OpenFilter);
    }
    public void SelectPeriod(){
        browserActions.click(Date);
        browserActions.click(ChosenPeriod);
    }
    public void EnterDueIn(){
        browserActions.type(DueIn, "3");
    }
    public void SelectUpdated(){
        browserActions.click(updated);
        browserActions.click(ChosenPeriod);
    }
    public void SelectStatus(){
        browserActions.click(Status);
        browserActions.click(ChosenStatus);

    }
    public void EnterUser(){
        browserActions.type(FromUser_Email, "admin");
    }
    public void EnterCompany(){
        browserActions.type(Company, "Johns Group");
    }
    public void EnterDepartment(){
        browserActions.type(Department, "dep");
    }
    public void EnterTechnician(){
        browserActions.click(Tech);
        browserActions.click(ChosenTech);
    }
    public void SelectUpdatedBy(){
        browserActions.click(UpdBy);
        browserActions.click(UpdByOptions);
    }
    public void CheckSubscribedTo(){
        browserActions.click(OnlyticketsSubscribedTo);
    }
    public void SelectPriority(){
        browserActions.click(priority);
        browserActions.click(ChosenPriority);
    }
    public void ClickSubmit(){
        browserActions.click(SubmitButton);
    }
    public void ClickSave(){
        browserActions.click(SaveButton);
    }
    public void ResetFilter(){
        browserActions.click(RemoveFilter);
    }

    public void IsTicketDisplayed(){
        assertion.assertElementIsDisplayed(CreatedTicket);

    }
    public void DeleteCreatedTicket(){
        browserActions.click(TicketCheckBox);
        browserActions.click(DeleteTicket);
        browserActions.acceptAlert();

    }
    public void DeleteAllTickets(){
        browserActions.click(AllTicketCheck);
        browserActions.click(DeleteBulk);
        browserActions.acceptAlert();
    }
    public void ClickTag(){
        browserActions.click(NewTag);
    }
    public void IsTicketsTableDisplayed(){
        assertion.assertElementIsDisplayed(TaggedTickets);
    }
    public void FilterByCategory(){
        browserActions.click(CategoryAnderson);
    }




}
