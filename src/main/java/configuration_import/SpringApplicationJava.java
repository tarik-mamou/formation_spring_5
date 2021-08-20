package configuration_import;

import commun.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication1.class);
        Etudiant etudiant = ctx.getBean("monEtudiant",Etudiant.class);
        System.out.println(etudiant);

    }
}
