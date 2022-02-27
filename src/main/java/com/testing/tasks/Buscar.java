package com.testing.tasks;

import com.testing.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.testing.userinterfaces.GooglePage.INPUT_GOOGLE;
import static com.testing.userinterfaces.GooglePage.RESULTADOS_GOOGLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar implements Task {

    private String palabra;

    public Buscar(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(palabra).into(INPUT_GOOGLE)
        );
        Esperar.stopExecution(1000);
        actor.attemptsTo(
                Click.on(RESULTADOS_GOOGLE)
        );
        Esperar.stopExecution(2000);
    }

    public static Buscar la(String palabra) {
        return instrumented(Buscar.class, palabra);
    }
}