package ex6_Facade.clase;

public class Medic {
    public static  boolean trebuieInternat(Pacient pacient){
        return pacient.getGradSeveritate()>5;
    }

}
