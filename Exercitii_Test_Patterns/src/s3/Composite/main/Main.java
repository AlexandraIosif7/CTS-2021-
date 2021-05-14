package s3.Composite.main;

import s3.Composite.clase.ObiectivTuristic;
import s3.Composite.clase.Primarie;
import s3.Composite.clase.UnitateOrganizare;

public class Main {
    public static void main(String[] args) throws Exception {

        UnitateOrganizare obiectTuristic1=new ObiectivTuristic("Arcul de Triumf");
        UnitateOrganizare obiectTuristic2=new ObiectivTuristic("Palatul Parmanetului");
        UnitateOrganizare obiectTuristic3=new ObiectivTuristic("Muzeul satului");

        UnitateOrganizare primarieGenerala= new Primarie("Bucuresti");
        UnitateOrganizare primarie1= new Primarie("Sector1");
        UnitateOrganizare primarie2= new Primarie("Sector2");

        primarie2.adaugaNod(obiectTuristic2);
        primarie1.adaugaNod(obiectTuristic1);
        primarie1.adaugaNod(obiectTuristic3);

        primarieGenerala.adaugaNod(primarie1);
        primarieGenerala.adaugaNod(primarie2);

        primarieGenerala.afiseazaDetalii();
        System.out.println("----------------------");
        primarie1.afiseazaDetalii();


    }
}
