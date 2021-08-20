package autowiring;

public class Etudiant {

	private Cours cours;

	private String nom;

	public String getNom() {
		return nom;
	}

	public Etudiant(Cours cours) {
		this.cours = cours;
	}

	public Etudiant(Cours cours, String nom) {
		this.cours = cours;
		this.nom=nom;

	}

	@Override
	public String toString() {
		return "Etudiant [cours=" + cours + "]";
	}

}
