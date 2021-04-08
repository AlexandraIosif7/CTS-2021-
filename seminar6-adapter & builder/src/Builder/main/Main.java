package Builder.main;

import Builder.clase.Rezervare;
import Builder.clase.RezervareBuilder;
import Builder.clase.RezervareBuilderV2;

// EXERCITIUL E-3
public class Main {


    public static void main(String[] args) {
        Rezervare rezervare1;
        Rezervare rezervare2;

        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        rezervareBuilder.setCodRezervare(100).setAreMancare(true);
        rezervare1=rezervareBuilder.build();

        rezervare2=new RezervareBuilder(20).setAreMuzicaPersonalizata(true).build();

        Rezervare rezervare3=new Rezervare(125,true,true,true,true,"pop");

        //facem shallow copy si nu e corect ptr ca folosim aceeasi instanta ca la primul obiect
        Rezervare rezervare4=rezervareBuilder.setCodRezervare(222).setAreScaun(true).build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);

        //se face aici deep copy si se face cate un obiect nou de fiecare data
        RezervareBuilderV2 rezervareBuilder2=new RezervareBuilderV2().setAreBautura(true).setAreBautura(true).setAreScaunErgonomic(true);
        Rezervare rezervare5=rezervareBuilder2.setCodRezervare(140).build();
        Rezervare rezervare6=rezervareBuilder2.setCodRezervare(150).build();

    }
}
