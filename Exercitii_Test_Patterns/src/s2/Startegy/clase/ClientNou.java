package s2.Startegy.clase;

import java.util.ArrayList;
import java.util.List;

public class ClientNou {
    private String nume;
    private CriteriuDecizie criteriuDecizie;
    private List<Locuinta> locuinteDisponibile=new ArrayList<>();

    public ClientNou(String nume, List<Locuinta> locuinte) {
        this.nume = nume;
        this.criteriuDecizie=new PretMinPerMetru();
        this.locuinteDisponibile=locuinte;
    }

    public void setCriteriuDecizie(CriteriuDecizie criteriuDecizie) {
        this.criteriuDecizie = criteriuDecizie;
    }

    public void alegeOLocuinta(){
        System.out.println( this.criteriuDecizie.alege(locuinteDisponibile).toString());
    }
}
