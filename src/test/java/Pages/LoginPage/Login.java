package Pages.LoginPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    BrowserActions browserActions;
    Assertion assertion;
    public Login(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By Name = By.id("Username");
    By Password = By.id("Password");
    By LoginButton = By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[5]/td/input");
    By SubmitTicketAsGuest = By.xpath("//button[@class='submit_new_ticket']");


    //Actions
    public void navigateToWebsite(String url){
        browserActions.navigateToURl(url);
    }

    public void ValidLogin(){
        browserActions.type(Name , "admin");
        browserActions.type(Password , "admin@C1");
       browserActions.click(LoginButton);
    }
    public void EnterName(String st){
        browserActions.type(Name , st);

    }
    public void EnterPass(String pass){
        browserActions.type(Name , pass);

    }
    public void ClickLogin(){
        browserActions.click(LoginButton);
    }


    public void ClickSubmitTicketAsGuest (){
        browserActions.click(SubmitTicketAsGuest);
    }

}
