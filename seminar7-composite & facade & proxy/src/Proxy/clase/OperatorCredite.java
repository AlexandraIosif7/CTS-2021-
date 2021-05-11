package Proxy.clase;

public class OperatorCredite implements IOperatorCredite {

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        System.out.println(String.format("A fost acordat creditul cu suma %d in moneda %s",suma,moneda));
    }
}
