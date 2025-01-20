package co.com.retosiigo.certificacion.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;


public class LoginUserInterface {


    public static Target USERNAME_INPUT = Target.the("Campo usuario").located(ByShadow.cssSelector("#username-input","#username"));

    public static final Target PASSWORD_INPUT = Target.the("Campo clave").located(ByShadow.cssSelector("#password-input","#current-password"));

    public static final Target BTN_LOGIN = Target.the("Boton de login")
            .located(By.id("login-submit"));

}
