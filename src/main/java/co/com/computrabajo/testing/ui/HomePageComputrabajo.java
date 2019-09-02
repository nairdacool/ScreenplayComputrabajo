package co.com.computrabajo.testing.ui;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.computrabajo.com.co/")
public class HomePageComputrabajo extends PageObject {
	
	private static final Target signInAreabutom = Target.the("Sign in area").located(By.xpath("//a[@class='submit_n']"));
		
	public static Target SignInArea() {
		return signInAreabutom;
	}
}
