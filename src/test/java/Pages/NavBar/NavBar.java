package Pages.NavBar;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavBar {
    BrowserActions browserActions;
    Assertion assertion;
    public NavBar(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }


    //Locators
    By NewTicketButton = By.xpath("//*[@id=\"newTicket\"]/a");

    //Actions
    public void ClickNewTicket(){
        browserActions.click(NewTicketButton);
    }
}
