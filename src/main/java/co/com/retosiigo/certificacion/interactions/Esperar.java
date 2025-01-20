package co.com.retosiigo.certificacion.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.markers.IsSilent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction, IsSilent {

  private final int segundos;

  protected Esperar(int segundos) {
    this.segundos = segundos;
  }

  public static Esperar unTiempo(int var) {
    return instrumented(Esperar.class, var);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    new InternalSystemClock().pauseFor(segundos);
  }
}
