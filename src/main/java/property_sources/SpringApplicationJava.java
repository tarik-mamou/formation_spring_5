package property_sources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);
        //Personne personne = ctx.getBean("maPersonne",Personne.class);
        PersonneAvecValueAnn personneAvecValueAnn = ctx.getBean("maPersonneAvecValueAnn",PersonneAvecValueAnn.class);
        System.out.println(personneAvecValueAnn.getTaille());
    }
}
