package com.example.javadersleri.nesnetabanli2;

public class Villa extends Ev {
    private boolean garajVarmi;

    public Villa() {
    }

    public Villa(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }

    public boolean isGarajVarmi() {
        return garajVarmi;
    }

    public void setGarajVarmi(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }
}
