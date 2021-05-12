package ex11_Strategy.clase;

public class PlataCash implements IPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("A fost realizata plata cash in valoare de "+suma);
    }
}
