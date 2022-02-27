package com.testing.interactions;

import com.testing.models.ResultadoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Guardar implements Interaction {

    private String total;
    private ResultadoModel actualValor;

    public Guardar(String total, ResultadoModel actualValor) {
        this.total = total;
        this.actualValor = actualValor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String partsub = total.substring(9, 18);
        String rpc = partsub.replace(",", "");

        actualValor.setTotal(rpc);
    }

    public static Guardar totalBusqueda(String total) {
        return instrumented(Guardar.class, total);
    }
}

