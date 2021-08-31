package factory.xml.static_factory;

import factory.Etudiant;


public  class EtudiantFactory {
    public static Etudiant creer(){
        Etudiant etudiant=new Etudiant("ahmed");
        return etudiant;
    }
}