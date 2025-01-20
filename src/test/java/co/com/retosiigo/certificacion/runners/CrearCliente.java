package co.com.retosiigo.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crear_clientes.feature",
        glue = "co.com.retosiigo.certificacion.stepdefinitions",
        snippets = CAMELCASE
)

public class CrearCliente {
}
