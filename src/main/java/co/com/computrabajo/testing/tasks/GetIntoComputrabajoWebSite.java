package co.com.computrabajo.testing.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.computrabajo.testing.ui.HomePageComputrabajo;

public class GetIntoComputrabajoWebSite implements Task{
	
	PageObject page;
	
	public GetIntoComputrabajoWebSite (PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}
	
	public static GetIntoComputrabajoWebSite in(PageObject homepage) {
		return instrumented(GetIntoComputrabajoWebSite.class, homepage);
	}
	
}
