package ex11_Strategy.main;

import ex11_Strategy.clase.Pacient;
import ex11_Strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {

        Pacient pacient=new Pacient(250);
        pacient.platesteInternare();
        pacient.setModDePlata(new PlataCard());
        pacient.platesteInternare();
    }
}
