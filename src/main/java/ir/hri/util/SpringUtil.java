package ir.hri.util;

import ir.hri.bean.AnnotConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
            new String[]{"beans.xml"});

    private static AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static AnnotationConfigApplicationContext getannotationConfigApplicationContext() {
        annotationConfigApplicationContext.register(AnnotConfig.class);
        annotationConfigApplicationContext.refresh();
        return annotationConfigApplicationContext;
    }


    public static void reInitializeApplicationContext() {
        applicationContext = new ClassPathXmlApplicationContext(
                new String[]{"beans.xml"});
    }
}
