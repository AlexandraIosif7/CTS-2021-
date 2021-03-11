package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare=30;
	

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public float optineSumaFinantare() {
		return sumaFinantare;
	}

	public static float getSumaFinantare(){
		return sumaFinantare;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Elev: ").append(super.toString()).append(" ");
		stringBuilder.append("Clasa: ").append(clasa).append(" ");
		stringBuilder.append("Tutore: ").append(tutore).append(" ");

		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}

}
