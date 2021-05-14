package Template.clase;

public class Spectator extends SpectatorAbstract {

    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println(nume+" se aseaza la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume+" prezinta biletul");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(nume+" este controlat corporal");

    }

    @Override
    public void ocupareLoc() {
        System.out.println(nume+" si-a ocupat locul");

    }
}
