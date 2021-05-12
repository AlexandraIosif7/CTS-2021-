package ex6_Facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Facade {


    public static boolean internamPacientul(Pacient pacient, Salon salon){
        if(pacient.getGradSeveritate()>0){
            if(Medic.trebuieInternat(pacient)){
                if(salon.estePatLiber(pacient)){
                    return true;
                }
            }

        }
        return false;
    }

}
