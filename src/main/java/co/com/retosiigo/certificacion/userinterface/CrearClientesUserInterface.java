package co.com.retosiigo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class CrearClientesUserInterface {



    public static Target BTN_CREAR = Target.the("Boton crear cliente siigo").located(ByShadow.cssSelector("button","siigo-header-molecule[class='data-siigo-five9 hydrated']","siigo-button-atom[data-id='header-create-button']"));
    public static Target CREAR_CLIENTES = Target.the("lista clientes").located(ByShadow.cssSelector("a[data-value='Clientes']","siigo-header-molecule[class='data-siigo-five9 hydrated']"));


    public static Target NOMBRES = Target.the("lista clientes").located(ByShadow.cssSelector("input[class='mdc-text-field__input']","siigo-textfield-web[class='hydrated']"));
    public static Target Apellidos = Target.the("lista clientes").located(ByShadow.cssSelector("a[data-value='Usuario']","siigo-header-molecule[class='data-siigo-five9 hydrated']"));
    public static Target Num = Target.the("lista clientes").located(ByShadow.cssSelector("a[data-value='Usuario']","siigo-header-molecule[class='data-siigo-five9 hydrated']"));







}
