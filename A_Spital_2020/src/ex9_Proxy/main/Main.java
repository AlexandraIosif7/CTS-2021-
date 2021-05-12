package ex9_Proxy.main;


import ex9_Proxy.clase.Pacient;
import ex9_Proxy.clase.ProxyPacient;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1= new Pacient("Ion",25,false,false);
        pacient1.interneaza();

        //PROXY
        Pacient pacient2= new Pacient("Vasile",75,false,false);
        ProxyPacient proxy=new ProxyPacient(pacient2);
        proxy.interneaza();

        Pacient pacient3= new Pacient("Maria",55,true,false);
        proxy.setPacient(pacient3);
        proxy.interneaza();

    }
}
