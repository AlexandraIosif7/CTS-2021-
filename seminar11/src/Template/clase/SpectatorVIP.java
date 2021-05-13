package Template.clase;

public class SpectatorVIP extends SpectatorAbstract {

    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println(nume+" se aseaza la coada cu prioritate");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume+" prezinta biletul primul");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(nume+" nu mai este controlat corporal");

    }

    @Override
    public void ocupareLoc() {
        System.out.println(nume+" si-a ocupat locul in loja");

    }
}
