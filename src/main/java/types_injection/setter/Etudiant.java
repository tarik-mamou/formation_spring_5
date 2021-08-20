package types_injection.setter;



public class Etudiant {

	private Cours cours;

	public void setCours(Cours cours) {
		this.cours = cours;
	}


	public Etudiant() {

	}

	@Override
	public String toString() {
		return "Etudiant [cours=" + cours + "]";
	}

}
