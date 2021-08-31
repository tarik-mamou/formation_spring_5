package factory.xml.static_factory;


import factory.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApplicationXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory/application_static_factory.xml");
		Etudiant etudiant1=context.getBean(Etudiant.class);
		//Etudiant etudiant2=context.getBean(Etudiant.class);

		System.out.println("resultat"+etudiant1.hashCode());
	//	System.out.println("resultat"+etudiant2.hashCode());

	}

}
