package spel.annotation_value;


import autowiring.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Cartable {

    @Value("#{'${propietaires}'.split(',')}")
    private List<String> proprietaires;

    public Cartable() {
    }


    public List<String> getProprietaires() {
        return proprietaires;
    }
}
