package ex4_Prototype.main;

import ex4_Prototype.clase.RetetaPrototype;

public class Main {
    public static void main(String[] args) {

        RetetaPrototype reteta1= new RetetaPrototype(20,0,50);
        RetetaPrototype reteta2= (RetetaPrototype) reteta1.copiaza();

        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());

    }
}
