package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestePromovabilitateCuFixture {

    private Grupa grupa;
    @Before
    public void setup() {
        grupa=new Grupa(1050);

        //adaugam studenti integralisti
        for(int i=0;i<20;i++){
            IStudent student= new Student();
            student.adaugaNota(5);
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        //adaugam studenti cu restante
        for(int i=0;i<15;i++){
            IStudent student= new Student();
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    public void testPerformanta(){
        grupa.getPromovabilitate();
    }
}

