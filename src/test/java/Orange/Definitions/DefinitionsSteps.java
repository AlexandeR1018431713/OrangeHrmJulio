package Orange.Definitions;

import Orange.Pages.LoginPages;
import Orange.Pages.PimPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPages loginPages = new LoginPages(driver);
	private PimPage pimPage = new PimPage(driver);

	

	@Given("^open the browser$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^the user fill out user (.*) password (.*)$")
	public void fillOutLogin(String userName, String password){
		this.loginPages = new LoginPages(driver);
		this.loginPages.fillOutLogin(userName, password);
	}

	@When("^the user select opcion add employee$")
	public void llegarAgregarEmpleado(){
		this.pimPage = new PimPage(driver);
		this.pimPage.llegarAgregarEmpleado();
	}

	@When("^the user fill out first Name(.*) midlle(.*) last Name(.*)$")
	public void fillOutAddEmployee(String firstName, String middleName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.fillOutAddEmployee(firstName, middleName, lastName);
	}

	@Then("^the user validate create (.*) (.*)$")
	public void validateEmployee(String firstName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.validateEmployee(firstName, lastName);
	}
}