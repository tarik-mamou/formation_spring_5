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
        String unit�=env.getProperty("unit�");
        System.out.println("la valeur de unit� est "+ unit�);
        if(unit�.equals("metre")){
            return taille;
        }
        else if( unit�.equals("decimetre")){
            return taille*10;
        }
        else if( unit�.equals("centimeter")){
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
