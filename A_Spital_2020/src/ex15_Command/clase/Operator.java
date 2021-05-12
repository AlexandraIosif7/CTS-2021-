package ex15_Command.clase;

import java.util.ArrayList;
import java.util.List;

//operatorul de comenzi
public class Operator {

    private List<IComanda> listaInternari;
    private List<IComanda> listaTratari;

    public Operator() {
        this.listaInternari=new ArrayList<>();
        this.listaTratari=new ArrayList<>();
    }

    public void adaugaInternare(IComanda comanda){
        this.listaInternari.add(comanda);
    }
    public void adaugaTratare(IComanda comanda){
        this.listaTratari.add(comanda);
    }

    public void executaInternari(){
        for(IComanda comanda:listaInternari){
            comanda.executa();
        }
        listaInternari.clear();
    }
    public void executaTratamente(){
        for(IComanda comanda:listaTratari){
            comanda.executa();
        }
        listaTratari.clear();
    }
}
