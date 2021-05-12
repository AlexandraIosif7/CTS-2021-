package ex5_Adapter.clase;

import java.util.List;

//clasa adaptata
public class MedicamentSpital {

    public String nume;
    public List<String> reteta;

    public MedicamentSpital(String nume, List<String> reteta) {
        this.nume = nume;
        this.reteta = reteta;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta())
        {
            System.out.println("S-a achizitionat medicamentul "+nume+" pe baza de reteta");
        }
        else
            System.out.println("Medicamentul  "+nume+" nu se afla pe reteta si nu poate fi cumparat!");
    }
    public boolean prezintaReteta(){
        return reteta.contains(nume);
    }
}
