package types_injection.constructeur;

public class Cours {
	String nom;

	@Override
	public String toString() {
		return "Cours [nom=" + nom + "] "+ this.hashCode() ;
	}



	public Cours(String nom) {
		this.nom = nom;
	}
}
