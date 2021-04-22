package Flyweight.main;

import Flyweight.clase.Flyweight;
import Flyweight.clase.FlyweightFactory;
import Flyweight.clase.Rezervare;

//B RESTAURANT PROBLEMA 10
public class Main {

    public static void main(String[] args) {

        Rezervare rezervare1=new Rezervare(10,5,15);
        Rezervare rezervare2=new Rezervare(11,2,10);
        Rezervare rezervare3=new Rezervare(12,7,12);
        Rezervare rezervare4=new Rezervare(13,3,17);

        FlyweightFactory flyweightFactory= new FlyweightFactory();

        Flyweight client= flyweightFactory.getClientFlyweight("0730423");
        client.printeazaRezervare(rezervare1);

        flyweightFactory.getClientFlyweight("0730423").printeazaRezervare(rezervare2);
        flyweightFactory.getClientFlyweight("0730").printeazaRezervare(rezervare3);
        flyweightFactory.getClientFlyweight("0730").printeazaRezervare(rezervare4);





    }
}
