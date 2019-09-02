package co.com.computrabajo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.computrabajo.testing.ui.SignInArea.emailRegisteredIndicator;

public class SigInForm implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(emailRegisteredIndicator()).viewedBy(actor).asString();
	}

	public static SigInForm emailAlreadyRegistered() {
		return new SigInForm();
	}

}
