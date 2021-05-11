package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> clientiFactory;

    public FlyweightFactory() {
        this.clientiFactory=new HashMap<>();
    }

    public Flyweight getClientFlyweight(String nrTelefon){
        if(clientiFactory.containsKey(nrTelefon)){
            return clientiFactory.get(nrTelefon);
        }
        else
        {
            //aici daca vrem sa avem un nume ptr fiecare client nou si sa nu hardcodam ori citim de la tastatura ori dintr-un fisier
            Client clientNou=new Client("Marcel",nrTelefon,"marcel@yahoo.com");
            clientiFactory.put(nrTelefon,clientNou);

            return clientNou;
        }

    }
}
