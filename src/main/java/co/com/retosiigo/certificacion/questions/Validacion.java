package co.com.retosiigo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.retosiigo.certificacion.userinterface.CrearClientesUserInterface.BTN_CREAR;

public class Validacion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        Boolean inicio_ok = Visibility.of(BTN_CREAR).answeredBy(actor).booleanValue();
        System.out.println("El elemento es " + inicio_ok);
        return inicio_ok ;
    }

    public static Validacion es(){return new Validacion();}
}

