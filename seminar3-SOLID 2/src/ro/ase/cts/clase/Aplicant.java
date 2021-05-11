package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{

	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecteAnterioare;
	

	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareRaspunsProiect(Proiect proiect){

		boolean esteAcceptat = punctaj>=proiect.getPragDeAcceptare();

		StringBuilder stringBuilder=new StringBuilder("Aplicantul ").append(nume).append(" ").append(prenume).append(" ");
		stringBuilder.append(esteAcceptat ? "a fost acceptat." : "a fost respins.");

		System.out.println(stringBuilder.toString());
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecteAnterioare = denumireProiect;
	}

	public void setVectorProiecteAnterioare(int nrProiecte, String[] denumiriProiecte)
	{
		this.nrProiecte = nrProiecte;
		this.denumiriProiecteAnterioare = denumiriProiecte;
	}

	public abstract float optineSumaFinantare();

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr proiecte=").append(nrProiecte);
		sb.append(", denumiri proiecte=").append(Arrays.toString(denumiriProiecteAnterioare));

		return sb.toString();
	}
}
