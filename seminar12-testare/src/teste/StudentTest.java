package teste;

import clase.Student;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {

    @Test
    public void testConstructorCuParametru(){
        String nume="Costel";
        Student student=new Student(nume);

        assertEquals(nume,student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorFaraParametrii(){
        Student student=new Student();

        //nu facem test doar cu student ptr ca va fi mereu diferit de null
        assertNotNull("atributul note nu a fost initializat",student.getNote());
        assertNotNull("atributul nume nu a fost initializat",student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        Student student=new Student();
        student.adaugaNota(5);

        assertEquals(5, student.getNota(0));
    }

    @Test
    public void testAdaugaNotaDimensiune(){
        Student student=new Student();

        student.adaugaNota(10);
        student.adaugaNota(8);

        assertEquals(2,student.getNote().size());
    }

    @Test
    public void testCalculeazaMedie(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);

        //nu sunt la fel ptr ca nr reale au multe zecimale si nu coincid si de aceea tre sa ii dam o precizie
        assertEquals(6.5f, student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalculeazaMedieFaraNota(){
        Student student=new Student();

        assertEquals(0,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testAreRestantaAdevarat(){
        Student student=new Student();

        student.adaugaNota(9);
        student.adaugaNota(2);
        assertTrue(student.areRestante());
    }
    @Test
    public void testNuAreRestante(){
        Student student=new Student();

        student.adaugaNota(9);
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }

    @Test
    public void testGetNotaExceptieV3()
    {
        Student student=new Student();
        student.adaugaNota(7);
        student.adaugaNota(10);
//1
        try {
            //2
            student.getNota(5); //daca arunca exceptie intra in catch si nu se mai executa ce este dupa
            //3
            fail("nu trebuia sa ajunga aici. Metoda trebuia sa arunce fail si nu arunca");
        }catch (IndexOutOfBoundsException e){
            //4
        }
        catch (Exception e){
            fail("Metoda arunca alta exceptie");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaExceptieV4(){
        Student student=new Student();
        student.adaugaNota(7);
        student.adaugaNota(10);

        student.getNota(5);
    }

//    @Test
//    public void testGetNotaExceptieV5(){
//        Student student=new Student();
//        student.adaugaNota(7);
//        student.adaugaNota(10);
//
//        assertThrows(IndexOutOfBoundsException.class,()->student.getNota(5));
//    }


}