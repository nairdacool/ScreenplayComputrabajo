package co.com.computrabajo.testing.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignInArea {
	
	private static final Target name =
			Target.the("Name Space").located(By.xpath("//input[@id='AccessModel_Name']"));
	private static final Target surname =
			Target.the("Lastname Space").located(By.xpath("//input[@id='AccessModel_SurName']"));
	private static final Target email =
			Target.the("Email Space").located(By.xpath("//input[@id='AccessModel_Email']"));
	private static final Target password =
			Target.the("Password Space").located(By.xpath("//input[@id='AccessModel_Password']"));
	private static final Target position =
			Target.the("Position Space").located(By.xpath("//input[@id='AccessModel_Cargo']"));
	private static final String departmentLocator = "//select//option[contains(text(),'%s')]";
	private static final Target submitButton = Target.the("click on submit button").located(By.xpath("//input[@id='sbStep1']"));
	private static final Target stepTwoIndicator = Target.the("step two indicator ask for personal data").
			located(By.xpath("//div[@class='title']//div//span[contains(text(),'Datos personales')]"));
	private static final Target emailRegisteredIndicator = Target.the("indication email is already registered").
			located(By.xpath("//span[@class='field-validation-error']"));
	
	public static Target name() {
		return name;
	}
	
	public static Target surname() {
		return surname;
	}
	
	public static Target email() {
		return email;
	}
	
	public static Target password() {
		return password;
	}
	
	public static Target position() {
		return position;
	}
	
	public static Target submitButton() {
		return submitButton;
	}
	
	public static Target stepTwoIndicator() {
		return stepTwoIndicator;
	}
	
	public static Target emailRegisteredIndicator() {
		return emailRegisteredIndicator;
	}
	
	public static Target department(String location) {
		Target department =
				Target.the("Select Department").located(By.xpath(formatString(departmentLocator, location)));
		return department;
	}
	
	public static String formatString(String text, Object... variables) {
		return String.format(text, variables);
	}
}


