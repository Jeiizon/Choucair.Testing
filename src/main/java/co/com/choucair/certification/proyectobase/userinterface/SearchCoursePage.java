package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage{
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad Choucair").
            located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").
            located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click para buscar el curso").
            located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target.the("Selecciona el curso").
            located(By.xpath("//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=489']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").
            located(By.xpath("//a[@class='aalink']"));
}
