package profiles;


import org.springframework.beans.factory.annotation.Autowired;

public class Service {

    @Autowired
    Database database;

    public  void chercherListeEtudiants() {
        //System.out.println(database);
    }

    public Database getDatabase(){
        return  database;
    }

}
