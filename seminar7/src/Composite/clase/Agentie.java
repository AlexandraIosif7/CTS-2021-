package Composite.clase;

import java.util.ArrayList;
import java.util.List;

//ASTA ESTE COMPOSITE ptr ca va avea mai multe filiale care sunt noduri frunza
//Composite trebuie sa implementeze clasa abstracta de baza si sa aiba si o relatie de has a cu ea!
public class Agentie implements Sediu{

    private List<Sediu> listaSedii;
    //puteam sa avem si numele agentiei

    public Agentie() {
        listaSedii= new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("-> Este o agentie!");
        for (Sediu sediu:listaSedii){
            sediu.afiseazaDescriere();
        }
    }

    @Override
    public void addNode(Sediu sediu) {
        listaSedii.add(sediu);
    }

    @Override
    public void removeNode(Sediu sediu) {
        listaSedii.remove(sediu);
    }

    @Override
    public Sediu getNode(int position) {
        return listaSedii.get(position);
    }
}
