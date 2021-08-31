package factory.xml.factory_bean;

import factory.Etudiant;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class EtudiantFactory extends AbstractFactoryBean<Etudiant> {


    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public boolean isSingleton() {
        return  true;
    }

    @Override
    public Class<?> getObjectType() {
        return Etudiant.class;
    }

    @Override
    protected Etudiant createInstance() throws Exception {
        return new Etudiant(nom);
    }
}
