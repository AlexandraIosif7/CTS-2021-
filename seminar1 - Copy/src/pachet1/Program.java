package pachet1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Program {
	
	public static void main(String [] args) {
		
		Zoo zoo=new Zoo();
		
		Girafa girafa1=new Girafa("Girafa 1");
		Girafa girafa2=new Girafa("Girafa 2");

		zoo.addAnimal(girafa1);
		zoo.addAnimal(girafa2);

		zoo.feedAllAnimals();

		Zebra zebra1 = new Zebra("Zebra 1");
		Zebra zebra2 = new Zebra("Zebra 2");

		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);

		zoo.feedAllAnimals();
		
	}
	
	

}
