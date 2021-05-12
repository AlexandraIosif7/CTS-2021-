package ex7_Decorator.clase;

public abstract class IDecorator implements IRezultate{
    private IRezultate rezultate;

    public IDecorator(IRezultate rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void printeazaRezultate() {
        rezultate.printeazaRezultate();
    }

    public abstract void incarcaRezultate();
}
