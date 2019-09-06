package co.com.computrabajo.testing.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.computrabajo.exeptions.*;
import co.com.computrabajo.models.Data;
import co.com.computrabajo.questions.SigInForm;
import co.com.computrabajo.testing.tasks.ClickInSubmit;
import co.com.computrabajo.testing.tasks.ClickSignInAreaButton;
import co.com.computrabajo.testing.tasks.FillForm;
import co.com.computrabajo.testing.tasks.GetIntoComputrabajoWebSite;
import co.com.computrabajo.testing.ui.HomePageComputrabajo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComputrabajoStepDefinitions {
	
	Actor adrian = Actor.named("Adrian");
	HomePageComputrabajo homepage;
	
	@Managed(driver = "chrome")
	WebDriver hisBrowser;
	
	@Given("^Adrian opens a web browser$")
	public void adrianOpensAWebBrowser() throws Exception {
		adrian.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
	}


	@Given("^Adrian enters to Computrabajo website on sign in area$")
	public void adrianEntersToComputrabajoWebsiteOnSignInArea() throws Exception {
		adrian.wasAbleTo(GetIntoComputrabajoWebSite.in(homepage));
		adrian.attemptsTo(ClickSignInAreaButton.button());
	}

	@When("^Adrian fill out the registration form with the next data$")
	public void adrianFillOutTheRegistrationFormWithTheNextData(List<Data> Data) throws Exception {
		adrian.attemptsTo(FillForm.fill(Data));
		adrian.attemptsTo(ClickInSubmit.button());
	
	}

	@Then("^Adrian validates that email is registered$")
	public void adrianValidatesThatEmailIsRegistered() throws Exception {
			adrian.should(seeThat(SigInForm.emailAlreadyRegistered(), equalTo("Este e-mail ya está registrado"))
				  .orComplainWith(ConexionNoDisponible.class, ConexionNoDisponible.getconexionNoDisponible()));
	}
}
