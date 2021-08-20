package profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationJavaUneConfiguration {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(UneConfiguration.class);
        //ctx.getEnvironment().setActiveProfiles("production");
        ctx.getEnvironment().setActiveProfiles("developpement");
        ctx.refresh();
        Service service = ctx.getBean("monService", Service.class);
        System.out.println(service.getDatabase());
    }
}
