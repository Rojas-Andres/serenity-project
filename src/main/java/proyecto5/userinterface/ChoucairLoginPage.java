package proyecto5.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    //$x("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]")
    public static final Target LOGIN_BUTTON= Target.the("Boton que muestra el formulario del login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER= Target.the("Donde escribimos el usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD= Target.the("Donde escribimos la contraseña").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Boton donde confirmamos el login ").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));


}
