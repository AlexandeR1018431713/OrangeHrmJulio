package Orange.Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    @FindBy(how = How.XPATH, using = "//button[@type= 'submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//a//span[text() = 'PIM']")
    private WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//button[text() = ' Add ']")
    private WebElement btnAddEmployee;

    @FindBy(how = How.XPATH, using = "//button[text() = ' Save ']")
    private WebElement btnSave;



    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnLogin() {
        this.btnLogin.isDisplayed();
        this.btnLogin.click();
    }

    public void btnPim(){
        this.btnPim.isSelected();
        this.btnPim.click();
    }

    public void btnAddEmployee(){
        this.btnAddEmployee.isDisplayed();
        this.btnAddEmployee.sendKeys(Keys.ENTER);
    }

    public void btnSave(){
        this.btnSave.isDisplayed();
        this.btnSave.click();
    }
}
