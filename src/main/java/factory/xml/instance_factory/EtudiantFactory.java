package factory.xml.instance_factory;

import factory.Etudiant;


public  class EtudiantFactory {
    //methode non statique
    public  Etudiant creer(){
        Etudiant etudiant=new Etudiant("ahmed");
        return etudiant;
    }
}