package Composite.clase;

//NOD FRUNZA - LEAF
public class Filiala implements Sediu {

    private String numeFiliala;

    public Filiala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("-> Acesta este filiala "+numeFiliala);
    }

    @Override
    public void addNode(Sediu sediu) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void removeNode(Sediu sediu) throws Exception {
        throw new Exception("Nu este implementata!");

    }

    @Override
    public Sediu getNode(int position) throws Exception {
        throw new Exception("Nu este implementata!");
    }
}
