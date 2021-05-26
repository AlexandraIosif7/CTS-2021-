package cts.iosif.alexandra.g1081.pattern.strategy;

public class Flotari implements IChallenge{
    @Override
    public void startExercitiu(int nrRepetitii) {
        System.out.println("->In acest challenge trebuie sa executam "+nrRepetitii+" de flotari consecutive");
    }
}
