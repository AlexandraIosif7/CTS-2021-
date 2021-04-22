package Command.clase;

import java.util.ArrayList;
import java.util.List;

//INVOKER
public class Operator {
    private List<Comanda> comenzi;

    public Operator() {
        this.comenzi=new ArrayList<>();
    }

    //adaugam o comanda la lista
    public void invoca(Comanda comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        comenzi.get(0).executa();
        comenzi.remove(0); //eliminam din lista dupa ce am executat
    }
}
