package s3.Decorator.main;

import s3.Decorator.clase.AbstractDecorator;
import s3.Decorator.clase.Bilet;
import s3.Decorator.clase.BiletCuGhid;
import s3.Decorator.clase.DecoratorCuAbonament;

public class Main {
    public static void main(String[] args) {
        Bilet biletCuGhid= new BiletCuGhid(20);
        biletCuGhid.vinde();
        System.out.println("----------------");

        AbstractDecorator biletCuAbonament= new DecoratorCuAbonament(biletCuGhid,10);
        biletCuAbonament.vindeAbonament();
        System.out.println("----------------");
        biletCuAbonament.vinde();
    }
}
