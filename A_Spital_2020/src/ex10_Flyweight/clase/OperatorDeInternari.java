package ex10_Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class OperatorDeInternari {
    private Map<String, Pacient> pacienti;

    public OperatorDeInternari() {
        this.pacienti=new HashMap<>();
    }

    public Pacient getPacient(String nume){
        if(pacienti.containsKey(nume)){
            return pacienti.get(nume);
        }
        else{
            Pacient pacientNou= new Pacient(nume,"0753648996","adresa2",25);
            pacienti.put(nume,pacientNou);

            return pacientNou;
        }
    }
}
