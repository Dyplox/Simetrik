package com.testing.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GooglePage extends PageObject {

    public static final Target INPUT_GOOGLE = Target.the("Input Google")
            .locatedBy("//input[contains(@Class, 'gLFyf')]");

    public static final Target RESULTADOS_GOOGLE = Target.the("Jbox resultados Google")
            .locatedBy("//span[contains(text(), 'Simetrik')]");

    public static final Target LBL_GOOGLE_RESULTS = Target.the("Restuldos busqueda en Google")
            .locatedBy("//div[contains(@id, 'result-stats')]");

    public GooglePage() {
        //vacio
    }
}