package autowiring;


import org.springframework.beans.factory.annotation.Autowired;

public class Cartable {

    @Autowired
    private Etudiant eleve;

    public Cartable() {
    }

    public String getProprietaire()
    {
        return eleve.getNom();

    }
}
