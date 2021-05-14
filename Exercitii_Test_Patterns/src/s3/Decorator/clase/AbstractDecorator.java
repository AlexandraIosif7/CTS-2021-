package s3.Decorator.clase;

public abstract class AbstractDecorator implements Bilet {

    private Bilet bilet;

    public AbstractDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vinde() {
        this.bilet.vinde();
    }

    public Bilet getBilet() {
        return bilet;
    }

    public abstract void vindeAbonament();
}
