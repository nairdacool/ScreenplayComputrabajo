package co.com.computrabajo.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.computrabajo.testing.ui.HomePageComputrabajo.SignInArea;

public class ClickSignInAreaButton implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SignInArea()));
	}
	
	public static Performable button() {
		return Tasks.instrumented(ClickSignInAreaButton.class);
	}

}
