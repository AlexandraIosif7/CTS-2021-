package ex6_Facade.main;

import ex6_Facade.clase.Facade;
import ex6_Facade.clase.Pacient;
import ex6_Facade.clase.Salon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pacient pacient= new Pacient("Mihai", 6,2);
        List<Integer> paturiLibere = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> paturiOcupate = new ArrayList<>(Arrays.asList(4,5,6));

        Salon salon= new Salon(paturiLibere,paturiOcupate);

        if(Facade.internamPacientul(pacient,salon)){
            System.out.println("Pacientul "+pacient.getNume() +" a fost internat in patul cu nr "+pacient.getNrPat());
            salon.ocupaPat(pacient.getNrPat());
        }
        else{
            System.out.println("Pacientul nu trebuie internat");
        }

        Pacient pacient2= new Pacient("Dorel", 3,2);
        if(Facade.internamPacientul(pacient2,salon)){
            System.out.println("Pacientul "+pacient2.getNume() +" a fost internat in patul cu nr "+pacient2.getNrPat());
            salon.ocupaPat(pacient.getNrPat());
        }
        else{
            System.out.println("Pacientul nu trebuie internat");
        }

    }
}
