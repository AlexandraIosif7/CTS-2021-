package s1.Command.main;

import s1.Command.clase.*;

public class Main {
    public static void main(String[] args) {

        Usa usa1= new UsaIntrare("Ion");
        Usa usa2=new UsaIntrare("Marian");

        Comanda comandaDeschide= new ComandaDeschide(usa1);
        Comanda comandInchide= new ComandaInchide(usa1);

        Operator operator= new Operator();
        operator.adaugaComanda(comandaDeschide);
        operator.adaugaComanda(comandInchide);

        operator.executaComanda();
        operator.executaComanda();
    }
}
