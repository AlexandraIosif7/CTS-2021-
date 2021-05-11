package Facade.main;

import Facade.clase.Facade;
import Facade.clase.Persoana;

//EXERCITIUL D7
public class Main {

    public static void main(String[] args) {

        Persoana persoana= new Persoana("Maria","2991207725375");

        //nu trebuie sa avem obiect facade ptr ca isEligible este functie, nu metoda
       if(Facade.isEligibile(persoana)){
           System.out.println("Persoana este eligibila");
       }
       else{
           System.out.println("Persoana nu este eligibila");
       }
    }
}
