package proyecto5.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    //$x("//div[@id='certificaciones']//strong")
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar curso").located(By.id("coursesearchbox"));
    //$x("//button[@class='btn btn-secondary']")
    public static final Target BUTTON_GO = Target.the("Click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
//$x("//div[@class='search-results']//a[contains(text(),'Foundation Express')]")
    public static final Target SELECT_COURSE = Target.the("Click en el curso").located(By.xpath("//div[@class='search-results']//a[contains(text(),'Foundation Express')]"));

}
