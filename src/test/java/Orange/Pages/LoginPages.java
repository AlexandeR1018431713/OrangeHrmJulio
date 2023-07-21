package Orange.Pages;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    private ButtonPages buttonPages;

    private Questions questions;

//esto es encontrar el elemento de la pagina
    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;
//esto es un constructor
    public LoginPages(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    public LoginPages() {

    }

    //esto es un metodo
    public void fillOutLogin(String userName, String password){
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
        this.buttonPages.btnLogin();
        this.questions.timeSeconds(2);
        this.questions.screenShot();
    }

}
