package Flyweight.clase;

//flyweight concret = client
public class Client implements Flyweight {

    //cele 3 campuri sunt partea permanenta la care adaugam rezervarea
    private String nume;
    private String nrTelefon;
    private String email;

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println(this.toString() + rezervare.toString());
    }

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
