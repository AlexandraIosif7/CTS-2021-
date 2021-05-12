package ex8_Composite.main;

import ex8_Composite.clase.Departament;
import ex8_Composite.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        Sectie sectie1= new Sectie("sectie1");
        Sectie sectie2= new Sectie("sectie2");
        Sectie sectie3= new Sectie("sectie3");


        Departament departament1= new Departament("departament1");
        Departament departament2= new Departament("departament2");

        departament1.adaugaDepartament(sectie3);

        departament2.adaugaDepartament(sectie1);
        departament2.adaugaDepartament(sectie2);

        departament1.adaugaDepartament(departament2);

        departament1.afiseazaDepartament();
        System.out.println("--------------------");
        departament2.afiseazaDepartament();
    }
}
