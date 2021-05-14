package s1.Command.clase;

public class UsaIntrare implements Usa {

    private String utilizator;

    public UsaIntrare(String utilizator) {
        this.utilizator = utilizator;
    }

    @Override
    public void deschide( ) {
        System.out.println("Usa de la intrare a fost deschisa de "+utilizator);
    }

    @Override
    public void inchide( ) {
        System.out.println("Usa de la intrare a fost inchisa de "+utilizator);

    }
}
