package first.sansId;

public class CreationSanId {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cours cours = new Cours("francais");
		
		Etudiant etudiant = new  Etudiant(cours);
		
		System.out.println(etudiant);
		
	}
}
