package com.testing.models;

public class ResultadoModel {

    private String total;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (!(object instanceof ResultadoModel)) {
            return false;
        }

        ResultadoModel objectToEvaluate = (ResultadoModel) object;
        return objectToEvaluate
                .getTotal()
                .equals(this.getTotal());
    }

    @Override
    public String toString() {
        return "resultado: " + this.getTotal();
    }
}