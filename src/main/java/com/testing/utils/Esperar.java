package com.testing.utils;

import com.testing.exceptions.ThreadStoppedException;

import static com.testing.utils.Constantes.THREAD_STOPPED_EXCEPTION_MESSAGE;

public class Esperar {

    private Esperar() {
    }

    public static void stopExecution(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ThreadStoppedException(THREAD_STOPPED_EXCEPTION_MESSAGE, e);
        }
    }
}
