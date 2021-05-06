package Strategy.main;

import Strategy.clase.Client;
import Strategy.clase.IPlata;
import Strategy.clase.PlataCard;

//B - 11
public class Main {
    public static void main(String[] args) {

        Client client1= new Client("Ionel");
        client1.plateste(100);


        client1.setTipPlata(new PlataCard());
        client1.plateste(205);

    }

}
