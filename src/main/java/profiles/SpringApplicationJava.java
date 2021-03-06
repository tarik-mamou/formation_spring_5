package profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class SpringApplicationJava {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ConfigurationApplication.class);
        //ctx.getEnvironment().setActiveProfiles("production");
        ctx.getEnvironment().setActiveProfiles("developpement");
        ctx.refresh();

        Service service = ctx.getBean("monService", Service.class);
        System.out.println(service.getDatabase());
    }
}
