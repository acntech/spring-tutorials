package no.acntech.tutorial.spring;

import no.acntech.tutorial.spring.bean.AnnotatedSpringBean;
import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import no.acntech.tutorial.spring.config.SpringConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BootstrapAnnotationBasedApplicationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapAnnotationBasedApplicationContext.class);

    public static void main(String[] args) {
        LOGGER.info("Bootstrapping Spring Application Context");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        SimpleSpringBean simpleSpringBean = context.getBean(SimpleSpringBean.class);
        LOGGER.info("Spring says: {}", simpleSpringBean.getMessage());

        AnnotatedSpringBean annotatedSpringBean = context.getBean(AnnotatedSpringBean.class);
        LOGGER.info("Spring says: {}", annotatedSpringBean.getMessage());
    }
}
