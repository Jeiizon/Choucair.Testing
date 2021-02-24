package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("Este es el boton para invocar el formulario de acceso").
            located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("Aqui pone usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Aqui pone contrasena").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Este es el boton de confirmacion login").
            located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
