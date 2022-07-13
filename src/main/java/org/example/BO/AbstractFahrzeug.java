package org.example.BO;

public class AbstractFahrzeug {
    protected Double verbrauchkwh;
    protected Integer geschwindigkeit;
    protected Integer fahrzeitinstunden;

    public Double getVerbrauchkwh() {
        return verbrauchkwh;
    }

    public void setVerbrauchkwh(Double verbrauchkwh) {
        this.verbrauchkwh = verbrauchkwh;
    }

    public Integer getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(Integer geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public Integer getFahrzeitinstunden() {
        return fahrzeitinstunden;
    }

    public void setFahrzeitinstunden(Integer fahrzeitinstunden) {
        this.fahrzeitinstunden = fahrzeitinstunden;
    }

}
