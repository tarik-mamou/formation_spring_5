package autowiring;

public class Cours {

	String nom;

	public Cours(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Cours [nom=" + nom + "] "+ this.hashCode() ;
	}
}
