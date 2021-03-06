package avec_ioc.java;

import commun.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import types_injection.constructeur.ConfigurationApplication;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);
        Etudiant etudiant = ctx.getBean("monEtudiant",Etudiant.class);
        System.out.println(etudiant);
    }
}
