package s3.Decorator.clase;

public class BiletCuGhid implements Bilet {

    private int pret;

    public BiletCuGhid(int pret) {
        this.pret = pret;
    }

    public int getPret() {
        return pret;
    }

    @Override
    public void vinde() {
        double pretCuGhid=pret + pret*0.5;
        System.out.println("Biletul cu ghid costa "+ pretCuGhid);
    }
}
