package s1.Builder.main;

import s1.Builder.clase.BarieraInteligenta;
import s1.Builder.clase.Builder;

public class Main {
    public static void main(String[] args) {

        BarieraInteligenta barieraInteligenta=new Builder().setButonBlocare(true).setModulPlata(false).setSenzorCard(true).setSenzorDistanta(true).build();
        System.out.println(barieraInteligenta.toString());

    }
}
