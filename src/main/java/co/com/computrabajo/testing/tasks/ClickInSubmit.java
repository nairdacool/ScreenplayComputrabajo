package co.com.computrabajo.testing.tasks;

import static co.com.computrabajo.testing.ui.SignInArea.submitButton;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickInSubmit implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(submitButton()));
		
	}

	public static Performable button() {
		return Tasks.instrumented(ClickInSubmit.class);
	}

}
