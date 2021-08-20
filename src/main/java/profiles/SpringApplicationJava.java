package profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplication.class);

        ConfigurableEnvironment configurableEnvironment = (ConfigurableEnvironment) ctx.getEnvironment();
        configurableEnvironment.setActiveProfiles("developpement");
     //   ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) ctx;
       // configurableApplicationContext.refresh();

      //  Service service = ctx.getBean("monService", Service.class);

        Database database = ctx.getBean("maDatabase",Database.class);
        Service service = ctx.getBean("monService", Service.class);
        System.out.println(service.getDatabase());
    }
}
