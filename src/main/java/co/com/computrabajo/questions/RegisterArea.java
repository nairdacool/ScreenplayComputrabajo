package co.com.computrabajo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.computrabajo.testing.ui.SignInArea.stepTwoIndicator;

public class RegisterArea implements Question<String> {


	@Override
	public String answeredBy(Actor actor) {
		return Text.of(stepTwoIndicator()).viewedBy(actor).asString();
	}
	
	public static RegisterArea stepTwoIndicatorProcess() {
		return new RegisterArea();
	}
}
