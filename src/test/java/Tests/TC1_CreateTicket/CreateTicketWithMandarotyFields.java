package Tests.TC1_CreateTicket;

import Pages.LoginPage.Login;
import Pages.NavBar.NavBar;
import Pages.TicketsPage.CreateTicketForm;
import Tests.TestBase;
import Config.Config;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateTicketWithMandarotyFields extends TestBase {
    String url = Config.getProperty("URL");
    Login login;
    NavBar navBar;
    CreateTicketForm createTicketForm;

    @BeforeMethod
    public void setupTest() {
        login = new Login(driver);
        navBar = new NavBar(driver);
        createTicketForm = new CreateTicketForm(driver);
    }
    public void navigateToUrl() {
       login.navigateToWebsite(url);
    }

    @Test
    public void Create_Ticket() {
        navigateToUrl();
        login.ValidLogin();
        navBar.ClickNewTicket();

        createTicketForm.SelectCategory();
        createTicketForm.EnterSubject();
        createTicketForm.EnterDetails("detaillls");
        createTicketForm.EnterAddress("Nasrcity");
        createTicketForm.ClickSubmitButton();




    }


}
