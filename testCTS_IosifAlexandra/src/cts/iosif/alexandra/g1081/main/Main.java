package cts.iosif.alexandra.g1081.main;

import cts.iosif.alexandra.g1081.pattern.builder.Builder;
import cts.iosif.alexandra.g1081.pattern.builder.CursDeFitness;
import cts.iosif.alexandra.g1081.pattern.builder.NivelDificultate;
import cts.iosif.alexandra.g1081.pattern.chain.*;
import cts.iosif.alexandra.g1081.pattern.strategy.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------EXERCITIUL 1----------------------");
        //STRATEGY
        IChallenge flotari=new Flotari();
        IChallenge genoflexiuni=new Genoflexiuni();
        IChallenge ridicariLaPiept= new RidicariLaPiept();

        Trainer trainer= new Trainer("Marian");
        trainer.setExercitiu(flotari);
        trainer.lanseazaChallenge(100);

        trainer.setExercitiu(genoflexiuni);
        trainer.lanseazaChallenge(100);

        trainer.setExercitiu(ridicariLaPiept);
        trainer.lanseazaChallenge(100);

        System.out.println("----------------EXERCITIUL 2----------------------");
        //BUILDER
        CursDeFitness curs1=new Builder()
                .setAntrenor("Ionel")
                .setNivelDificultate(NivelDificultate.MEDIU)
                .setFlotari(true)
                .setDurata(120)
                .construieste();
        System.out.println(curs1.toString());

        CursDeFitness curs2=new Builder()
                .setAntrenor("Marian")
                .setNrMaxParticipanti(25)
                .setPret(250)
                .setRidicari(true)
                .construieste();
        System.out.println(curs2.toString());

        CursDeFitness curs3=new Builder().setAntrenor("Ana")
                .setPlank(true)
                .setSquats(true)
                .setNivelDificultate(NivelDificultate.AVANSAT)
                .construieste();
        System.out.println(curs3.toString());

        CursDeFitness curs4=new Builder()
                .setAntrenor("indisponibil")
                .setDurata(65)
                .setRidicari(true)
                .setNrMaxParticipanti(30)
                .construieste();
        System.out.println(curs4.toString());


        System.out.println("--------------EXERICITIUL 3------------------------");
        //CHAIN
        FisaAccident fisa1= new FisaAccident("Ana",20,true,true,false,false);
        FisaAccident fisa2= new FisaAccident("Ion",25,false,true,false,false);
        FisaAccident fisa3= new FisaAccident("Mihai",30,false,false,true,false);
        FisaAccident fisa4= new FisaAccident("John",15,false,false,true,true);

        Verificator antrenor = new Antrenor();
        Verificator asistentMedical=new AsistentMedical();
        Verificator medicSala=new MedicSala();
        Verificator spital=new Spital();

        antrenor.setSuccesor(asistentMedical);
        asistentMedical.setSuccesor(medicSala);
        medicSala.setSuccesor(spital);

        antrenor.verifica(fisa1);
        antrenor.verifica(fisa2);
        antrenor.verifica(fisa3);
        antrenor.verifica(fisa4);

        System.out.println("\n ! O sala nu are asistent medical !");

        antrenor.setSuccesor(medicSala);
        antrenor.verifica(fisa2);
        antrenor.verifica(fisa4);

    }
}
