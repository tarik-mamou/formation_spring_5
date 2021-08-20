package scopes.singleton;

import commun.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);
        Etudiant etudiant = ctx.getBean("monEtudiant",Etudiant.class);
        Etudiant etudiant2 =  ctx.getBean("monEtudiant2",Etudiant.class);
        System.out.println(etudiant);
        System.out.println(etudiant2);

    }
}
