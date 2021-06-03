package teste;

import clase.Grupa;
import clase.IStudent;
import org.junit.Test;
import teste.mockuri.StudentDummy;
import teste.mockuri.StudentFake;
import teste.mockuri.StudentStub;

import java.awt.*;

import static org.junit.Assert.*;

public class TesteGrupaMock {

    //test cu dummy
    @Test
    public void testAdaugaStudent(){
        IStudent student=new StudentDummy();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);

        //verificam la lungimea sa fie fix 1
        assertEquals(1,grupa.getStudenti().size());

    }

    //test cu stub
    @Test
    public void testGetPromovabilitate(){
        IStudent student=new StudentStub();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

    //test cu fake - sa avem 8 studenti integralisti si 2 cu restante= promovabilitate 0.8 -RIGHT
    @Test
    public void testPromovabilitateRight(){

        Grupa grupa =new Grupa(1081);
        for(int i=0;i<8;i++){
            //nu putem sa mai declaram cu IStudent ptr ca folosim setteri din StudentFake si incalcam Liskov
            StudentFake studentFake=new StudentFake();
            studentFake.setAreRestante(false);

            grupa.adaugaStudent(studentFake);
        }
        for(int i=0;i<2;i++){
            StudentFake studentFake=new StudentFake();
            studentFake.setAreRestante(true);

            grupa.adaugaStudent(studentFake);
        }

        assertEquals(0.8,grupa.getPromovabilitate(),0.01);
    }

}