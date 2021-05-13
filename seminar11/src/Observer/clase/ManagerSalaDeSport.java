package Observer.clase;

import java.util.ArrayList;
import java.util.List;

//observabil abstract -cel care notifica
public abstract class ManagerSalaDeSport {
    private List<Observator> observatori;

    public ManagerSalaDeSport() {
        this.observatori = new ArrayList<>();
    }

    public void adaugaObservator(Observator observator){
        observatori.add(observator);
    }
    public void stergeObservator(Observator observator){
        observatori.remove(observator);
    }
    public void notificaObservatori(String mesaj){
        for(Observator observator:observatori){
            observator.primesteMesaj(mesaj);
        }
    }
}
