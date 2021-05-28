package teste;

import clase.Grupa;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteGrupaConstructor {

    // ----------- FACEM TOATE PRINCIPIILE PENTRU CONSTRUCTOR

    //--> Right-BICEP

    //RIGHT - testam cu valoare din interiorul intervalului
    @Test
    public void testConstructorNrGrupaCorect(){
        Grupa grupa= new Grupa(1081);

        assertEquals(1081,grupa.getNrGrupa());
    }

    //BOUNDARY - testam fix limitele pe care le avem
    @Test
    public void testConstructorLimitaInferiora(){
        Grupa grupa=new Grupa(1000);

        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaMaxima(){
        Grupa grupa=new Grupa(1100);

        assertEquals(1100,grupa.getNrGrupa());
    }

    //INVERSE - sa plecam de la rezultat si sa ajungem la input ca sa verificam
    //verificam operatie inversa
    //noi nu avem la ce sa facem aici

    //CROSS CHECK - sa verificam daca avem si alta metoda cu ajutorul careia sa obtinem acelasi rezultat cu metoda noastra testata deja
    //la grupa nu avem ce sa verificam dar la student avem 2 constructori si putem sa facem cross check ptr unul dintre ei

    //ERROR - verificam ca obtinem erorile asteptate
    // avem ceva de genu daca nr grupei nu este in limite si verificam daca ne arunca exceptia care trebuie

    @Test(expected = IllegalArgumentException.class)
    public void testeExceptieLimitaInferioaraConstructor(){
        Grupa grupa= new Grupa(900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeExceptieLimitaSuperioaraConstructor(){
        Grupa grupa= new Grupa(1200);
    }

    //PERFORMANCE - trebuie sa verificam daca metoda rezolva problema cu consum optim de resurse
    //putem testa timpul

    @Test(timeout = 500)
    public void testPerformantaConstructor(){
        Grupa grupa= new Grupa(1051);
    }

    //--> CORRECT

    //CONFORMANCE - conformitatea formatului - nu putem sa facem un test ptr constructorul grupei

    //ORDERING - daca avem o lista intr-o ordine sau nu

    //RANGE - trebuie sa stabilim intervale ptr input si output si trebuie sa facem
    //teste cu valori din interiorul intervalului, fix pe limite si in afara limitelor
    //am facut deja asta la Right-BICEP, un test de genul Right(ptr interior), teste Boundary(ptr limite fixe) si Error(ptr exteriorul intervalului()

    //REFERENCE - nu avem niciun niciun import in constructorul grupei

    //EXISTANCE - verificam daca exista
    //daca era Integer in loc de int puteam sa facem testul asta ptr ca putea sa fie null  ???
    //putem verifica daca lista noastra de studenti nu este null dupa aplicarea constructorului
    @Test
    public void testConstructorExistance(){
        Grupa grupa= new Grupa(1081);

        //verificam ca lista noastra de studenti sa fie alocata in constructor
        assertNotNull(grupa.getStudenti());
    }

    //CARDINALITY - regula 0-1-N
    //ptr 0 avem deja test ptr ca am verificam alocarea, si ptr 1 si N nu trebuie sa testam in constructor ptr ca scopul constructorului nostru
    //nu este sa adauge studenti, ci doar sa aloce spatiu

    //TIME - testam timpul dar am facut deja asta la Performance
}