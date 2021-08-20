package property_sources;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;

public class Personne implements ApplicationContextAware {

    private int taille;
    private ApplicationContext applicationContext;

    //en metres
    public Personne(int taille) {
        this.taille = taille;
    }

    int getTaille(){
        Environment env = applicationContext.getEnvironment();
        String unité=env.getProperty("unité");
        System.out.println("la valeur de unité est "+ unité);
        if(unité.equals("metre")){
            return taille;
        }
        else if( unité.equals("decimetre")){
            return taille*10;
        }
        else if( unité.equals("centimeter")){
            return taille*100;
        }
        return 0;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.setContext(applicationContext);
    }

    private void setContext(ApplicationContext applicationContext) {
        this.applicationContext=applicationContext;
    }
}
