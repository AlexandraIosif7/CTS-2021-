package s3.Composite.clase;

public abstract class  UnitateOrganizare {
    private String name;

    public UnitateOrganizare(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void adaugaNod(UnitateOrganizare unitate) throws Exception;
    public abstract void stergeNod(UnitateOrganizare unitate) throws Exception;
    public abstract UnitateOrganizare getNod(String nume) throws Exception;
    public abstract void afiseazaDetalii();
}
