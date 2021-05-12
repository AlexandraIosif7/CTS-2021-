package ex10_Flyweight.clase;

//starea permanenta
public class Pacient implements IInternarePacient {
    private String nume;
     private String nrTel;
     private String adresa;
     private int varsta;

    public Pacient(String nume, String nrTel, String adresa, int varsta) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("->");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", varsta=").append(varsta);
        return sb.toString();
    }

    @Override
    public void interneaaza(DetaliiInternare internare) {
        System.out.println("A fost internat pacientul: ");
        System.out.println( this.toString());
        System.out.println("Delatiile internarii sunt: ");
        System.out.println(internare.toString());
    }
}
