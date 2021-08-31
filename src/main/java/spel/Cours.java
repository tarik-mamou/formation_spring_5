package spel;

public class Cours {



	private String nom;

	public Cours(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Cours [nom=" + nom + "] "+ this.hashCode() ;
	}
}
