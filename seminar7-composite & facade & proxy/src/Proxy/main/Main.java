package Proxy.main;

import Proxy.clase.Moneda;
import Proxy.clase.OperatorCredite;
import Proxy.clase.OperatorCrediteProxy;

// EXERCITIUL D8
public class Main {

    public static void main(String[] args) {

        OperatorCredite operatorCredite=new OperatorCredite();
        operatorCredite.creareCredit(Moneda.EUR,4000);

        //PROXY

        OperatorCrediteProxy proxy= new OperatorCrediteProxy(operatorCredite);
        proxy.creareCredit(Moneda.EUR,4000);
        proxy.creareCredit(Moneda.RON,4000);

    }
}
