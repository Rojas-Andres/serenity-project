package proyecto5.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto5.tasks.Login;
import proyecto5.tasks.OpenUp;
import proyecto5.tasks.Search;
import proyecto5.questions.Answer;
public class ChoucairAcademyStepdefinitions {

    // Preparan el scenario para nuestroa actor
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandons wants to learns automation at the academy choucair$")
    public void thanBrandonsWantsToLearnsAutomationAtTheAcademyChoucair() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }


    @When("^he search for the course (.*) on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(String course) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesFoundationExpress(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
