package org.example.BO;

public class LKW_7 implements Verbrauchprostunde{


    public float verbrauchkwh, fahrzeitinstunden;

    public LKW_7() {
    }

    public LKW_7 (float verbrauchkwh, float fahrzeitinstunden)
    {
        this.verbrauchkwh = verbrauchkwh;
        this.fahrzeitinstunden = fahrzeitinstunden;
    }

    public float getverbrauchkwh() {
        return verbrauchkwh;
    }


    public float getfahrzeitinstunden() {
        return fahrzeitinstunden;
    }

    public float getverbrauch()
    {
        return
        verbrauchkwh / fahrzeitinstunden ;
    }



}
