package co.com.computrabajo.testing.tasks;

import static co.com.computrabajo.testing.ui.SignInArea.*;
import java.util.List;
import co.com.computrabajo.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm implements Task {
	
	private List<Data> data;
	
	public FillForm(List<Data> data) {
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(data.get(0).getName()).into(name()));
		actor.attemptsTo(Enter.theValue(data.get(0).getSurname()).into(surname()));
		actor.attemptsTo(Enter.theValue(data.get(0).getEmail()).into(email()));
		actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(password()));
		actor.attemptsTo(Enter.theValue(data.get(0).getPosition()).into(position()));
		actor.attemptsTo(Click.on(department(data.get(0).getLocation())));
	}
	
	public static Performable fill(List<Data> data) {
		return Tasks.instrumented(FillForm.class, data);
	}

}
