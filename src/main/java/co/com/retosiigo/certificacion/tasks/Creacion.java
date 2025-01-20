package co.com.retosiigo.certificacion.tasks;

import co.com.retosiigo.certificacion.interactions.Esperar;
import co.com.retosiigo.certificacion.userinterface.CrearClientesUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Creacion implements Task {


    public static Creacion cliente() {
        return instrumented(Creacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Esperar.unTiempo(2000),
                Click.on(CrearClientesUserInterface.BTN_CREAR),
                Esperar.unTiempo(2000),
                Click.on(CrearClientesUserInterface.CREAR_CLIENTES),
                Esperar.unTiempo(2000),
                Enter.theValue("15452").into(CrearClientesUserInterface.NOMBRES),
                Esperar.unTiempo(5000)
        );

    }

}
