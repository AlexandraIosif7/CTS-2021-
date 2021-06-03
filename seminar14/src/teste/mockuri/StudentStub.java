package teste.mockuri;

import clase.IStudent;

import java.util.List;

//cand returnam valori harcodate este un stub
//fake este cand avem atribute si nu harcodam
public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "Gigel";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 8.9f;
    }

    @Override
    public int getNota(int index) {
        return 10;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
