package ex8_Composite.clase;

public class Sectie implements IDepartament {

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaDepartament(IDepartament departament) throws Exception {
        throw new Exception(" Nu se poate");
    }

    @Override
    public void stergeDepartament(IDepartament departament) throws Exception {
        throw new Exception(" Nu se poate");
    }

    @Override
    public IDepartament getDepartament(String nume) throws Exception {
        throw new Exception(" Nu se poate");
    }

    @Override
    public void afiseazaDepartament() {
        System.out.println("Sectia ->"+nume);
    }

    @Override
    public String getNume() {
        return this.nume;
    }
}
