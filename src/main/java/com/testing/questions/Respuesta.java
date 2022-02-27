package com.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.testing.userinterfaces.GooglePage.LBL_GOOGLE_RESULTS;

public class Respuesta implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_GOOGLE_RESULTS).answeredBy(actor);
    }

    public static Question<String> google() {
        return new Respuesta();
    }
}