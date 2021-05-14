package Memento.clase;

public class Meci {
    private String echipaGazda;
    private String echipaOaspecti;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStuwarzi;

    public Meci(String echipaGazda, String echipaOaspecti, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStuwarzi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspecti = echipaOaspecti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStuwarzi = nrStuwarzi;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspecti(String echipaOaspecti) {
        this.echipaOaspecti = echipaOaspecti;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStuwarzi(int nrStuwarzi) {
        this.nrStuwarzi = nrStuwarzi;
    }

    public Memento creazaMemento(){
        Memento memento=new Memento(this.nrSpectatori, this.echipaGazda, this.echipaOaspecti);
        return  memento;
    }

    public void seteazaMemento(Memento memento){
        this.nrSpectatori=memento.getNrSpectatori();
        this.echipaGazda=memento.getEchipaGazda();
        this.echipaOaspecti=memento.getEchipaOaspeti();
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspecti='").append(echipaOaspecti).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrStuwarzi=").append(nrStuwarzi);
        sb.append('}');
        return sb.toString();
    }
}
