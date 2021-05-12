package ex6_Facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere;
    private List<Integer> paturiOcupate;

    public Salon(List<Integer> paturiLibere, List<Integer> paturiOcupate) {
        this.paturiLibere = paturiLibere;
        this.paturiOcupate = paturiOcupate;
    }
    public void ocupaPat(int nr){
        paturiLibere.remove(Integer.valueOf(nr));
        paturiOcupate.add(nr);
    }

    public boolean estePatLiber(Pacient pacient){
        return this.paturiLibere.contains(pacient.getNrPat());
    }
}
