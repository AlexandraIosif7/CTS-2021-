package ex7_Decorator.clase;

public class DecoratorOnline extends IDecorator{

    public DecoratorOnline(IRezultate rezultate) {
        super(rezultate);
    }

    @Override
    public void printeazaRezultate() {
        super.printeazaRezultate();
        System.out.println("-> Disponibil acum si online!");
    }

    @Override
    public void incarcaRezultate() {
        System.out.println("S-au afisat rezultatele online");
    }
}
