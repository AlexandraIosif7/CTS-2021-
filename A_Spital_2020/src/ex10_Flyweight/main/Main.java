package ex10_Flyweight.main;

import ex10_Flyweight.clase.DetaliiInternare;
import ex10_Flyweight.clase.OperatorDeInternari;
import ex10_Flyweight.clase.Pacient;

public class Main {
    public static void main(String[] args) {

        DetaliiInternare internare1=new DetaliiInternare(20,2,15);
        DetaliiInternare internare2=new DetaliiInternare(21,3,7);

        OperatorDeInternari operatorDeInternari=new OperatorDeInternari();
        Pacient pacient = operatorDeInternari.getPacient("Ionel");
        pacient.interneaaza(internare1);
    }
}
