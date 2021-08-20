package first.sansId;

public class Cours {
	String nom;

	@Override
	public String toString() {
		return "Cours [nom=" + nom + "]";
	}



	public Cours(String nom) {
		this.nom = nom;
	}
}
