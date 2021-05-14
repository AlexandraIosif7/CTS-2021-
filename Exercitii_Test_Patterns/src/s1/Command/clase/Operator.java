package s1.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<Comanda> comandaList;

    public Operator() {
        this.comandaList=new ArrayList<>();
    }
     public void adaugaComanda(Comanda comanda){
        comandaList.add(comanda);
     }

     public void executaComanda(){
        comandaList.get(0).executa();
        comandaList.remove(0);
     }
}
