package ex2_SimpleFactory.clase;

public class Brancardier implements PersonalSpital {

    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Brancardier: "+this.nume);
    }
}
