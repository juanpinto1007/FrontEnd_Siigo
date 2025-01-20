package co.com.retosiigo.certificacion.tasks;


import co.com.retosiigo.certificacion.interactions.Esperar;



import co.com.retosiigo.certificacion.userinterface.LoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IniciarSesion implements Task {

    private String usuario;
    private String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IniciarSesion enSiigo(String usuario, String clave) {
        return instrumented(IniciarSesion.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

                actor.attemptsTo(
                        Esperar.unTiempo(2000),
                        Enter.theValue(usuario).into(LoginUserInterface.USERNAME_INPUT),
                        Esperar.unTiempo(2000),
                        Enter.theValue(clave).into(LoginUserInterface.PASSWORD_INPUT),
                        Esperar.unTiempo(2000),
                        Click.on(LoginUserInterface.BTN_LOGIN),
                        Esperar.unTiempo(5000)
                );

    }



}
