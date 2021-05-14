package s3.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Primarie extends UnitateOrganizare {

    private List<UnitateOrganizare> listaCopii;

    public Primarie(String name) {
        super(name);
        listaCopii=new ArrayList<>();
    }


    @Override
    public void adaugaNod(UnitateOrganizare unitate) {
        listaCopii.add(unitate);
    }

    @Override
    public void stergeNod(UnitateOrganizare unitate) {
        listaCopii.remove(unitate);
    }

    @Override
    public UnitateOrganizare getNod(String nume) {
        for(UnitateOrganizare unitate:listaCopii){
            if(unitate.getName().equals(nume))
                return unitate;
        }
        System.out.println("Nu s-a gasit unitatea cu numele: "+nume);
        return null;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("-> Primaria: "+super.getName());
        for(UnitateOrganizare unitate:listaCopii){
            unitate.afiseazaDetalii();
        }
    }
}
