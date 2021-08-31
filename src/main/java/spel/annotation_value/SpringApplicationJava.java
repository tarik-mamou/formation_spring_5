package spel.annotation_value;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);

        Cartable cartable=ctx.getBean(Cartable.class);

        System.out.println(cartable.getProprietaires());

    }
}
