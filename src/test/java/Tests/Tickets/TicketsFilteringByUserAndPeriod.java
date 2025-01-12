package Tests.Tickets;

import Config.Config;
import Pages.LoginPage.Login;
import Pages.NavBar.NavBar;
import Pages.TicketsPage.CreateTicketForm;
import Pages.TicketsPage.TicketsFilterForm;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*create a ticket --> find it through a filter(user and period) --> delete it */

public class TicketsFilteringByUserAndPeriod extends TestBase {
    String url = Config.getProperty("URL");
    Login login;
    NavBar navBar;
    TicketsFilterForm ticketsFilter;
    CreateTicketForm createTicketForm;


    @BeforeMethod
    public void setupTest() {
        login = new Login(driver);
        navBar = new NavBar(driver);
        ticketsFilter = new TicketsFilterForm(driver);
        createTicketForm = new CreateTicketForm(driver);

    }

    public void navigateToUrl() {
        login.navigateToWebsite(url);
    }

    @Test
    public void Filter_Ticket() {
        navigateToUrl();
        login.ValidLogin();
        //create a ticket as an admin
        navBar.ClickNewTicket();
        createTicketForm.EnterSubject("New ticket by selenuim");

        createTicketForm.ClickCatrgory();
        createTicketForm.SelectCategory();

        createTicketForm.EnterDetails("Detaillls aa detaillls");
        createTicketForm.EnterAddress("Nasrcity");

        createTicketForm.ClickSubmitButton();
        //search for it by admin
        navBar.NavigateToTickets();
        ticketsFilter.OpenFilter();
        ticketsFilter.SelectPeriod();
        ticketsFilter.EnterUser();
        ticketsFilter.ClickSubmit();
        //is it created?
        ticketsFilter.IsTicketDisplayed();
        //delete all tickets
        ticketsFilter.DeleteAllTickets();


    }
}