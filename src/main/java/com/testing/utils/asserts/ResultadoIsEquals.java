package com.testing.utils.asserts;

import com.testing.models.ResultadoModel;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class ResultadoIsEquals extends TypeSafeMatcher<ResultadoModel> {

    private ResultadoModel expectedResultado;

    public ResultadoIsEquals(ResultadoModel expectedResultado) {
        this.expectedResultado = expectedResultado;
    }

    @Override
    protected boolean matchesSafely(ResultadoModel actualResultado) {
        return expectedResultado.equals(actualResultado);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("El resultado esperado de la busqueda deberia ser \n");
        description.appendValue(this.expectedResultado);
    }

    public static ResultadoIsEquals to(ResultadoModel expectedResultado){
        return new ResultadoIsEquals(expectedResultado);
    }
}
