package org.example;

import org.example.BO.E_Lastenbikes;
import org.example.BO.LKW_40;
import org.example.BO.LKW_7;
import org.example.BO.Verbrauchprostunde;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        E_Lastenbikes Fahrad = new E_Lastenbikes( 20,10);
        LKW_7 LKW1 = new LKW_7(  10,20);
        LKW_40 LKW2 = new LKW_40(  50,20);
        sendedaten(LKW1);
        sendedaten(LKW2);
        sendedaten(Fahrad);

    }

    public static void sendedaten (Verbrauchprostunde x)
    {
        System.out.println(x.getverbrauch());
    }

}
