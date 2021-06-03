package teste.mockuri;

import clase.IStudent;

import java.util.List;


//PENTRU UN OBIECT DUMMY FUNCTIONALITATILE NU CONTEAZA DECI LASAM METODELE ASA,
//NU CONTEAZA CE RETURNEAZA PTR CA NU VOR FI APELATE
public class StudentDummy implements IStudent {
    @Override
    public String getNume() {
        return null;
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
        return 0;
    }

    @Override
    public int getNota(int index) {
        return 0;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
