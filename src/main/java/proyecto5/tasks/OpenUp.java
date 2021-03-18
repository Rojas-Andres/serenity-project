package proyecto5.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import proyecto5.userinterface.ChoucairAcademyPage;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static Performable thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}