package org.example.BO;

public class E_Lastenbikes implements Verbrauchprostunde {

    public float verbrauchkwh, fahrzeitinstunden;

    public E_Lastenbikes() {
    }

    public E_Lastenbikes(float verbrauchkwh, float fahrzeitinstunden) {
        this.verbrauchkwh = verbrauchkwh;
        this.fahrzeitinstunden = fahrzeitinstunden;
    }

    public float getverbrauchkwh() {
        return verbrauchkwh;
    }


    public float getfahrzeitinstunden() {
        return fahrzeitinstunden;
    }

    public float getverbrauch() {
        return 10;
    }
}
