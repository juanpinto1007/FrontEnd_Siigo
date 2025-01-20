package co.com.retosiigo.certificacion.stepdefinitions;



import co.com.retosiigo.certificacion.interactions.ChromeDriver;
import co.com.retosiigo.certificacion.questions.Validacion;
import co.com.retosiigo.certificacion.tasks.Creacion;
import co.com.retosiigo.certificacion.tasks.IniciarSesion;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class AutenticacionStepDefinition {

    @Managed
    WebDriver myDriver;

   @Before
    public void setUp(){
       setTheStage(new Cast());
       theActorCalled("Juan");
    }

    @Dado("que se ingresa al login del aplicativo")
        public void queSeIngresaAlLoginDelAplicativo() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(ChromeDriver.chrome().conURL("https://qastaging.siigo.com/#/login")));

    }
    @Cuando("Juan digita el usuario (.+) y la clave (.+)$")
    public void digitaElUsuarioYLaClave(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enSiigo(usuario, clave));
    }

    @Cuando("el usuario guarde la informacion del cliente")
    public void elUsuarioEsteEnElModuloDeCliente() {
        theActorInTheSpotlight().attemptsTo(Creacion.cliente());
    }

    @Entonces("el puede observar que la creacion es exitosa")
    public void elPuedeObservarQueLaCreacionEsExitosa() {

    }
    @Entonces("el puede observar el ingreso al aplicativo")
    public void elPuedeObservarElIngresoAlAplicativo() {
        theActorInTheSpotlight().should(seeThat(Validacion.es(),
                is(equalTo(true))));
    }



}
