package types_injection.constructeur;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import types_injection.setter.ConfigurationApplication;
import types_injection.setter.Etudiant;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);
        types_injection.setter.Etudiant etudiant = ctx.getBean("monEtudiant", Etudiant.class);
        System.out.println(etudiant);

    }
}
