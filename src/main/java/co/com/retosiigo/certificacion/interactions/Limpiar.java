package co.com.retosiigo.certificacion.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class Limpiar implements Interaction {
  private Target input;

  public Limpiar(Target input) {
    this.input = input;
  }

  public static Limpiar campo(Target input) {
    return instrumented(Limpiar.class, input);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    int longitud = input.resolveFor(actor).getValue().length();
    for (int i = 0; i < longitud; i++) {
      input.resolveFor(actor).sendKeys(Keys.BACK_SPACE);
    }
  }
}
