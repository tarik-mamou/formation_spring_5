package sans_ioc;

import commun.Cours;
import commun.Etudiant;

public class CreationSansId {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cours cours = new Cours("francais");
		
		Etudiant etudiant = new  Etudiant(cours);
		
		System.out.println(etudiant);
		
	}
}
