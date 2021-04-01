package Adapter.clase;

//ADAPTER DE OBIECTE
public class BiletAdaptorObiect implements IBiletOnline {

    private Bilet bilet;

    public BiletAdaptorObiect(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline() {
        this.bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        this.bilet.rezervare();
    }
}
