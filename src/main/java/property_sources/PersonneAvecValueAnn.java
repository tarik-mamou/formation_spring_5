package property_sources;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;

public class PersonneAvecValueAnn  {

    private int taille;
   //sans valeur par d�faut
    @Value("${unit�}")
    private String unit�;

    //avec valeur par d�faut
   /* @Value("${unit�:metre}")
    private String unit�;
*/
    //en metres
    public PersonneAvecValueAnn(int taille) {
        this.taille = taille;
    }

    int getTaille(){
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
}
