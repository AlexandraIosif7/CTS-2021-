package cts.iosif.alexandra.g1081.pattern.strategy;

public class Trainer {
    private IChallenge exercitiu;
    private String numeTrainer;

    public Trainer(String numeTrainer) {
        this.exercitiu = new Flotari();
        this.numeTrainer = numeTrainer;
    }
    public void setExercitiu(IChallenge exercitiu) {
        this.exercitiu = exercitiu;
    }
    public void lanseazaChallenge(int nrRepetari){
        System.out.println(numeTrainer+" spune ca avem un challenge nou:");
        this.exercitiu.startExercitiu(nrRepetari);
    }
}
