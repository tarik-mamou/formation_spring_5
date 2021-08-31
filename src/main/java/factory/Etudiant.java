package factory;

import commun.Cours;

public class Etudiant {

    private String nom;


    public Etudiant(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
