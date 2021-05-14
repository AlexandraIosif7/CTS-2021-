package s3.Decorator.clase;

public class DecoratorCuAbonament extends AbstractDecorator {
    public DecoratorCuAbonament(Bilet bilet, int nrZile) {
        super(bilet);
        this.nrZile=nrZile;
    }
    private int nrZile;

    @Override
    public void vinde() {
        super.vinde();
        double pretCuGhidSiAbonament= (getPret() + getPret()*0.5 )*nrZile;
        System.out.println("Biletul cu ghid, dar si cu abonament ptr "+nrZile+" zile costa "+ pretCuGhidSiAbonament);

    }

    @Override
    public int getPret() {
        return super.getBilet().getPret();
    }

    @Override
    public void vindeAbonament() {
        int pretCuAbonament= getPret()*nrZile;
        System.out.println("Biletul cu abonament ptr "+nrZile+" zile costa "+ pretCuAbonament);
    }
}
