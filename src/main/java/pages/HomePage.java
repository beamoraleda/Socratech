package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.security.auth.login.LoginContext;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Elementos de Homepage
    private By formAuthenticationLink = By.linkText("Form Authentication");
   // private By inputsLink = By.linkText("Inputs");


    //Acciones sobre Homepage
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
