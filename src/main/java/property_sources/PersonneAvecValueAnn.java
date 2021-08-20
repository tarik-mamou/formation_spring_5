package property_sources;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;

public class PersonneAvecValueAnn  {

    private int taille;
   //sans valeur par défaut
    @Value("${unité}")
    private String unité;

    //avec valeur par défaut
   /* @Value("${unité:metre}")
    private String unité;
*/
    //en metres
    public PersonneAvecValueAnn(int taille) {
        this.taille = taille;
    }

    int getTaille(){
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
}
