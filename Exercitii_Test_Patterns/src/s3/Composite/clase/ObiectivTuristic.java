package s3.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class ObiectivTuristic extends UnitateOrganizare {

    public ObiectivTuristic(String name) {
        super(name);

    }


    @Override
    public void adaugaNod(UnitateOrganizare unitate) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void stergeNod(UnitateOrganizare unitate) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public UnitateOrganizare getNod(String nume) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("+Obiectiv Turistic: "+super.getName());
    }
}
