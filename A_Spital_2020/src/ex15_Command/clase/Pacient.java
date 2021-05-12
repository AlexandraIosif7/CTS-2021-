package ex15_Command.clase;

//pacientul o sa faca parte din clasa medic(executant)
public class Pacient {
    private String name;
    private int gradSeveritate;

    public Pacient(String name, int gradSeveritate) {
        this.name = name;
        this.gradSeveritate = gradSeveritate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradSeveritate() {
        return gradSeveritate;
    }

    public void setGradSeveritate(int gradSeveritate) {
        this.gradSeveritate = gradSeveritate;
    }
}
