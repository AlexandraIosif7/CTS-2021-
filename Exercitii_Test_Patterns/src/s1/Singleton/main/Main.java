package s1.Singleton.main;

import s1.Singleton.clase.BarieraAutomata;

public class Main {
    public static void main(String[] args) {
        BarieraAutomata bariera1 = BarieraAutomata.getBariera();
        BarieraAutomata bariera2 = BarieraAutomata.getBariera();

        bariera1.ridica();
        bariera2.ridica();

        bariera1.coboara();
        bariera2.coboara();
    }



}
