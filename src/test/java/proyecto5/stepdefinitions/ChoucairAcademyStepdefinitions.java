package proyecto5.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto5.model.AcademyChoucairData;
import proyecto5.tasks.Login;
import proyecto5.tasks.OpenUp;
import proyecto5.tasks.Search;
import proyecto5.questions.Answer;

import java.util.List;

public class ChoucairAcademyStepdefinitions {

    // Preparan el scenario para nuestroa actor
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandons wants to learns automation at the academy choucair$")
    public void thanBrandonsWantsToLearnsAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));

    }


    @When("^he search for the course on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(List<AcademyChoucairData> academyChoucairData)throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesFoundationExpress(List<AcademyChoucairData> academyChoucairData) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}
