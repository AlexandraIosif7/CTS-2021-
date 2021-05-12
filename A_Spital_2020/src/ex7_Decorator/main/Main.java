package ex7_Decorator.main;

import ex7_Decorator.clase.DecoratorOnline;
import ex7_Decorator.clase.IDecorator;
import ex7_Decorator.clase.Rezultate;

public class Main {
    public static void main(String[] args) {

        Rezultate rezultateOffline= new Rezultate();
        rezultateOffline.printeazaRezultate();

        IDecorator rezultateOnline= new DecoratorOnline(rezultateOffline);
                rezultateOnline.printeazaRezultate();
        rezultateOnline.incarcaRezultate();
    }


}
