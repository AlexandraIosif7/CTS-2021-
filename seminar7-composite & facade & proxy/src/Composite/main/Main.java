package Composite.main;

import Composite.clase.Agentie;
import Composite.clase.Filiala;
//EXERCITIUL D9
public class Main {

    public static void main(String[] args) {

        Filiala filiala1=new Filiala("Magheru");
        Filiala filiala2=new Filiala("Grozavesti");
        Filiala filiala3=new Filiala("Rahova");
        Filiala filiala4=new Filiala("Dorobanti");

        Agentie agentie1=new Agentie();
        Agentie agentie2=new Agentie();
        Agentie agentie3=new Agentie();

        agentie1.addNode(filiala1);
        agentie1.addNode(filiala3);

        agentie2.addNode(filiala2);

        agentie3.addNode(filiala4);

        agentie1.addNode(agentie3);

        agentie1.afiseazaDescriere();
        System.out.println();
        agentie2.afiseazaDescriere();

        ////

        agentie3.removeNode(filiala4);
        agentie1.addNode(filiala4);
        agentie1.removeNode(agentie3);

        agentie1.afiseazaDescriere();
        System.out.println();
        agentie2.afiseazaDescriere();


    }
}
