package Decorator.main;


import Decorator.clase.DecoratorAbstract;
import Decorator.clase.DecoratorCuLaMultiAni;
import Decorator.clase.DecoratorCuPasteFericit;
import Decorator.clase.NotaDePlata;

//B EX.7
public class Main {

    public static void main(String[] args) {

        NotaDePlata notaInitiala = new NotaDePlata(55);
        notaInitiala.printeaza();
        System.out.println();

        DecoratorAbstract decoratorLaMultiAni=new DecoratorCuLaMultiAni(notaInitiala);
        decoratorLaMultiAni.printeazaFelicitare();
        System.out.println();
        decoratorLaMultiAni.printeaza();

        System.out.println();
        DecoratorAbstract decoratorCuPasteFericit=new DecoratorCuPasteFericit(notaInitiala);
        decoratorCuPasteFericit.printeaza();



        //putem sa facem mostenire dintr-un decorator in alt decorator doar ptr metodele care sunt scrise cu super() in calasa DecoratorAbstract
        System.out.println();
        NotaDePlata notaDePlataCuDouaMesaje =new NotaDePlata(150);
        DecoratorAbstract decoratorLaMultiAni2=new DecoratorCuLaMultiAni(notaDePlataCuDouaMesaje);
        DecoratorAbstract decoratorCuPasteFerici2=new DecoratorCuPasteFericit(decoratorLaMultiAni2);
        decoratorCuPasteFerici2.printeaza();

    }
}
