package ex8_Composite.clase;

public interface IDepartament {
    public void adaugaDepartament(IDepartament departament) throws Exception;
    public void stergeDepartament(IDepartament departament) throws Exception;
    public IDepartament getDepartament(String nume) throws Exception;
    public void afiseazaDepartament();
    public String getNume();
}
