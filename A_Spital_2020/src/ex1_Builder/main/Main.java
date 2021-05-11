package ex1_Builder.main;

import ex1_Builder.clase.PachetInternare;
import ex1_Builder.clase.PachetInternareBuilder;

public class Main {
    public static void main(String[] args) {

        PachetInternare pachetInternare=new PachetInternareBuilder("Alin").setHalat(true).setMicDejun(true).setPat(false).setPapuci(true).build();
        System.out.println( pachetInternare.toString());
    }
}
