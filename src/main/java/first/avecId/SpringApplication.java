package first.avecId;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.codec.*;

import first.sansId.Etudiant;



public class SpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Etudiant etudiant=context.getBean(Etudiant.class);
		System.out.println("resultat"+etudiant);

	}
}
