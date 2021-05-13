package Observer.clase;

//observator concre-cel care primeste mesaj
public class Client implements Observator {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume+" ai primit mesajul: "+ mesaj);
    }
}
