package ex3_FactoryMethod.clase;

public class Asistent implements PersonalSpital {

    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Asistent: "+this.nume);
    }
}
