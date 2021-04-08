package Facade.clase;

public class Facade {


    //am facut sub forma de functie, nu de metoda
    public static boolean isEligibile(Persoana persoana){
        if(persoana.getVarsta()>=18){
            if(!Politie.isUrmarit(persoana)){
                if(!BirouDeCredite.areCredite(persoana)){
                    return true;
                }
            }
        }
        return false;
    }
}
