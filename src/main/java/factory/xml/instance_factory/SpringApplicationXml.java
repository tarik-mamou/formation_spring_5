package factory.xml.instance_factory;


import factory.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApplicationXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory/application_instance_factory.xml");
		Etudiant etudiant1=context.getBean(Etudiant.class);
		//Etudiant etudiant2=context.getBean(Etudiant.class);
		System.out.println("resultat"+etudiant1);
		//System.out.println("resultat"+etudiant2.hashCode());

	}

}
