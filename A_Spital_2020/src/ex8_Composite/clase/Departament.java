package ex8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IDepartament {

    private String nume;
    private List<IDepartament> subdivizii=new ArrayList<>();

    public Departament(String nume) {
        this.nume=nume;
        this.subdivizii = new ArrayList<>();
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void adaugaDepartament(IDepartament departament) {
        subdivizii.add(departament);
    }

    @Override
    public void stergeDepartament(IDepartament departament) {
        subdivizii.remove(departament);
    }

    @Override
    public IDepartament getDepartament(String nume) {
        for(IDepartament subdivizie:subdivizii){
            if(subdivizie.getNume().equals(nume)){
                return subdivizie;
            }
        }
        return null;
    }

    @Override
    public void afiseazaDepartament() {

        System.out.println(this.nume + "-> Este departament:");
        for(IDepartament subdivizie:subdivizii){
            subdivizie.afiseazaDepartament();
        }
    }
}
