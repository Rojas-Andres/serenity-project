package proyecto5.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyecto5.userinterface.ChoucairLoginPage;

public class Login implements Task {

    public static Login onThePage(){
        return Tasks.instrumented(Login.class);
    }
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON)
        , Enter.theValue("1006206400").into(ChoucairLoginPage.INPUT_USER),
        Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
