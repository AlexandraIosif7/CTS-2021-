package teste.mockuri;

import clase.IStudent;

import java.util.List;

//la fake trebuie sa avem atribute pe care le setam
//nu trebuie sa avem atribute ptr fiecare atibu din clasa student
//ci trebuie sa avem atribute fiecare metoda care returneaza ceva deci noi avem aici 5 metode cu return
//facem constr fara param si apoi setari ptr fiecare atribut
public class StudentFake implements IStudent {
    private String numeStudent;
    private List<Integer> listaNote;
    private float medie;
    private int nota;
    private boolean areRestante;

    public void setNumeStudent(String numeStudent) {
        this.numeStudent = numeStudent;
    }

    public StudentFake() {
    }

    public void setListaNote(List<Integer> listaNote) {
        this.listaNote = listaNote;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAreRestante(boolean areRestante) {
        this.areRestante = areRestante;
    }

    @Override
    public String getNume() {
        return numeStudent;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return listaNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return medie;
    }

    @Override
    public int getNota(int index) {
        return nota;
    }

    @Override
    public boolean areRestante() {
        return areRestante;
    }
}
