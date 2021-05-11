package Composite.clase;

public interface Sediu {

    //obligatoriu o metoda de descriere

    public void afiseazaDescriere();
    public void addNode(Sediu sediu) throws Exception;
    public void removeNode(Sediu sediu) throws Exception;
    public Sediu getNode(int position) throws Exception;
}
