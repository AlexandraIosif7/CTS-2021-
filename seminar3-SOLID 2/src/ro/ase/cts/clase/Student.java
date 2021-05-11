package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantare=20;


	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public float optineSumaFinantare() {
		return sumaFinantare;
	}

	public static float getSumaFinantare(){
		return sumaFinantare;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Student: ").append(super.toString()).append(" ");
		stringBuilder.append("Ani Studii: ").append(anStudii).append(" ");
		stringBuilder.append("Facultate: ").append(facultate).append(" ");

		return stringBuilder.toString();
	}

}
