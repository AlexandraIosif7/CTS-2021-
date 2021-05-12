package ex2_SimpleFactory.clase;

public class Medic implements PersonalSpital {

    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Medic: "+this.nume);
    }
}
