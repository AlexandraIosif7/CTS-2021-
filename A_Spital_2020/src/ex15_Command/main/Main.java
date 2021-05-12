package ex15_Command.main;


import ex15_Command.clase.*;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1=new Pacient("Ionel", 2);
        Pacient pacient2=new Pacient("Ana",8);

        //executantii
        Medic medic1=new Medic(pacient1);
        Medic medic2=new Medic(pacient2);

        //operator
        Operator operator=new Operator();

        if(medic1.getPacient().getGradSeveritate()>5) {
            IComanda comandaTrare1 = new ComandaTratarePeLoc(medic1);
            operator.adaugaTratare(comandaTrare1);
        }
        else{
            IComanda comandaInternare1=new ComandaInternare(medic1);
            operator.adaugaInternare(comandaInternare1);
        }

        if(medic2.getPacient().getGradSeveritate()>5) {
            IComanda comandaTrare2 = new ComandaTratarePeLoc(medic2);
            operator.adaugaTratare(comandaTrare2);
        }
        else{
            IComanda comandaInternare2=new ComandaInternare(medic2);
            operator.adaugaInternare(comandaInternare2);
        }

        operator.executaInternari();
        operator.executaTratamente();

    }
}
