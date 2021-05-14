package s2.Startegy.main;

import s2.Chain.clase.Client;
import s2.Startegy.clase.ClientNou;
import s2.Startegy.clase.Locuinta;
import s2.Startegy.clase.PretMinPerCamere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Locuinta locuinta1=new Locuinta("Lujerului", 12, 25);
        Locuinta locuinta2=new Locuinta("Victoriei", 45, 13);
        Locuinta locuinta3=new Locuinta("Grozavesti", 20, 40);

        List<Locuinta> locuinteDisponibile= new ArrayList<>(Arrays.asList(locuinta1,locuinta2,locuinta3));
        ClientNou clientNou= new ClientNou("Ion",locuinteDisponibile );
        clientNou.setCriteriuDecizie(new PretMinPerCamere());
        clientNou.alegeOLocuinta();
    }
}
