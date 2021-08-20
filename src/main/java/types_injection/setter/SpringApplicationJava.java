package types_injection.setter;


import configuration_import.ConfigurationApplication1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);
        Etudiant etudiant = ctx.getBean("monEtudiant",Etudiant.class);
        System.out.println(etudiant);

    }
}
