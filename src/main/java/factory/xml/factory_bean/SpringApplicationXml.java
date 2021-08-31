package factory.xml.factory_bean;


import factory.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.rmi.transport.ObjectTable;


public class SpringApplicationXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory/application_factory_bean.xml");
		Etudiant etudiant1=context.getBean("etudiant1",Etudiant.class);
		Etudiant etudiant2=context.getBean("etudiant2",Etudiant.class);

		System.out.println("resultat  "+etudiant1+" "+etudiant1.hashCode() );
		System.out.println("resultat "+etudiant2+" "+etudiant2.hashCode());

		//Etudiant etudiant3=context.getBean("etudiant1",Etudiant.class);
		//Etudiant etudiant4=context.getBean("etudiant2",Etudiant.class);



	//	System.out.println("resultat "+etudiant3+" "+etudiant3.hashCode() );
	//	System.out.println("resultat "+etudiant4+" "+etudiant4.hashCode());


	//	EtudiantFactory etudiantFactory=context.getBean("&etudiant2",EtudiantFactory.class);

	//	System.out.println("benFactory "+etudiantFactory);

	}

}
