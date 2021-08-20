package avec_ioc.xml;

import commun.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringApplicationXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Etudiant etudiant=context.getBean(Etudiant.class);
		System.out.println("resultat"+etudiant);

	}
}
