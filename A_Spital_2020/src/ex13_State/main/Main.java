package ex13_State.main;

import ex13_State.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Ionel",6);
        pacient.interneaza();
        pacient.subObservatie();
        pacient.externeaza();
        pacient.subObservatie();
        pacient.interneaza();
        pacient.setGradSeveritate(2);
        pacient.subObservatie();
    }
}
