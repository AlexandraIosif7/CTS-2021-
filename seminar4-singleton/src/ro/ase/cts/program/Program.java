package ro.ase.cts.program;

import ro.ase.cts.clase.Regina;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

import java.util.Arrays;

public class Program {

    public static void main(String[] args){

        //EAGER INITIALIZATION

        Presedinte presedinte1 = Presedinte.getInstance();
        Presedinte presedinte2 = Presedinte.getInstance();

        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());

        presedinte1.setNume("Basescu");
        presedinte2.setMandat(3);

        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());

        //LAZY INITIALIZATION - cea mai folosita
        PresedinteLazy presedinteL1 = PresedinteLazy.getInstance("presedinte Lazy",40,4);
        PresedinteLazy presedinteL2 = PresedinteLazy.getInstance("presedinte Lazy 2",50,3);

        System.out.println(presedinteL1.toString());
        System.out.println(presedinteL2.toString());

        presedinteL1.setNume("Basescu");
        presedinteL2.setMandat(1);

        System.out.println(presedinteL1.toString());
        System.out.println(presedinteL2.toString());

        //EXERCITIUL CU A I
        Regina regina1= Regina.getInstance(90,"Elizabeth", Arrays.asList("Charles",
                "Anne","Edward",
                "Andrew"));
        Regina regina2= Regina.getInstance(50,"Marie", Arrays.asList("Andrew"));

        System.out.println(regina1.toString());
        System.out.println(regina2.toString());

        regina1.setNume("Stephanie");
        regina2.setVarsta(50);

        System.out.println(regina1.toString());
        System.out.println(regina2.toString());

    }
}
