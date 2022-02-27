package com.testing.stepdefinitions;

import com.testing.models.ResultadoModel;
import com.testing.questions.Respuesta;
import com.testing.tasks.Buscar;
import com.testing.userinterfaces.GooglePage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.testing.utils.asserts.ResultadoIsEquals.to;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConexionStepDefinitions {

    private GooglePage page = new GooglePage();
    private String valor;
    private ResultadoModel totalActual = new ResultadoModel();
    private ResultadoModel totalExpected = new ResultadoModel();

    @Before
    public void configurarElEscenario() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el {string} abre el navegador en Google")
    public void queElAbreElNavegadorEnGoogle(String actor) {
        theActorCalled(actor);
        theActorInTheSpotlight().attemptsTo(Open.browserOn(page));
    }

    @Cuando("consulta {string}")
    public void consulta(String palabra) {
        theActorInTheSpotlight().attemptsTo(
                Buscar.la(palabra)
        );
        valor = Respuesta.google().answeredBy(theActorInTheSpotlight());

        totalActual.setTotal("");

        System.out.println(valor);
        String partsub = valor.substring(9, 18);
        String rpc = partsub.replace(",", "");

        totalActual.setTotal(rpc);
    }

    @Entonces("se valida los {string}")
    public void seValidaLos(String total) {
        totalExpected.setTotal(total);
        assertThat(totalActual, to(totalExpected));
    }
}