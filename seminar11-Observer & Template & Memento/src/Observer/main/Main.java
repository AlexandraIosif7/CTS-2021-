package Observer.main;

import Observer.clase.Client;
import Observer.clase.Manager;

//E SPORTIV 12
public class Main {
    public static void main(String[] args) {
        Manager manager= new Manager();
        Client client1= new Client("Dan");
        Client client2= new Client("Florin");
        Client client3= new Client("Razvan");

        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);

        manager.anuntaMeci("FOTBAL");

        manager.stergeObservator(client1);

        manager.anuntaMeci("VOLEI");

    }
}
