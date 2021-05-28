package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteGrupaPromovabilitate {

    //-> Right-BICEP

    //RIGHT
    @Test
    public void testGetPromovabilitate(){
        Grupa grupa=new Grupa(1081);

        //adaugam studenti integralisti
        for(int i=0;i<10;i++){
            IStudent student= new Student();
            student.adaugaNota(5);
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        //adaugam studenti cu restante
        for(int i=0;i<5;i++){
            IStudent student= new Student();
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66,grupa.getPromovabilitate(),0.1);
    }

    //BOUNDARY
    @Test
    public void testGetPromovabilitateLimitaInferioara(){
        Grupa grupa= new Grupa(1001);
        for( int i=0;i<5;i++){
            IStudent student= new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0,grupa.getPromovabilitate(),0.1);
    }

    @Test
    public void testGetPromovabilitateLimitaSuperioara(){
        Grupa grupa= new Grupa(1001);
        for( int i=0;i<5;i++){
            IStudent student= new Student();
            student.adaugaNota(10);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }

    //INVERSE - nu avem

    //CROSS CHECK - nu avem alta metoda care sa calculeze promovabilitatea

    //ERROR - testam daca arunca exceptie cand grupa nu are studenti si lista e goala
    @Test (expected = IndexOutOfBoundsException.class)
    public void testErrorConditions(){
        Grupa grupa=new Grupa(1050);

        grupa.getPromovabilitate();
    }

    //PERFORMANTA

    //aici avem o problema ptr ca vrem sa testam performanta metodei getPromovabilitate
    //dar in acest test avem si pasii de creare a grupei si a studentilor care vor lua din timp
    // asa ca facem toata aceasta pregatire intr-un setup unde facem un fixture care este aceasta grupa
    //ptr ca folosim acest fixtura doar intr-un test, e mai ok sa facem o alta clasa


    //-> CORRECT

    //CONFORMANCE - ???????

    //ORDERING - nu avem aici ca nu conteaza ordinea studentilor in grupa ptr promovabilitate

    //RANGE - setam un interval si setam in interior, pe limite, in exterior
    //sa fie promovabilitatea intre 0-1
    //nu putem sa facem noi o promovabilitate care sa fi emai mica decta 0 sau mai mare decat 1 deci nu putem sa facem testul de exterior aici

    //REFERENCE - referinta externa Student cu metoda areRestante
    //testam situatiile ptr referinta externa
    //facem sem viitor

    //EXISTANCE - daca exista studenti in lista - dar am facut deja la Error

    //CARDINALITY - regula 0-1-N
    //daca sunt 0 restantieri, daca sunt 0 studenti - am testat deja
    //daca sunt n studenti - am facut deja ptr 15 studenti
    //daca avem un singur student

    @Test
    public void testCardinality1Student(){
        Grupa grupa=new Grupa(1050);

        IStudent student=new Student();
        student.adaugaNota(9);
        student.adaugaNota(10);

        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

    //TIME - l-am facut la performanta dar exista niste diferente in ceea ce priveste ordinea apelarilor
    //ce se intampla daca apelez get promovabilitate inainte de adauga student - am facut deja la exceptie
}