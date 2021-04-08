package Facade.clase;

//lasam clasele default
class Politie {

    public static boolean isUrmarit(Persoana persoana){

      if(Integer.parseInt(""+persoana.getCNP().charAt(12))%2 == 0){
          return true;
      }
      return false;
    }
}
