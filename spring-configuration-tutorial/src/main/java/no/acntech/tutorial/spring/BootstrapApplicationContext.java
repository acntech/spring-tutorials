package no.acntech.tutorial.spring;

import no.acntech.tutorial.spring.bean.AnotherSimpleSpringBean;
import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import no.acntech.tutorial.spring.config.SpringConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BootstrapApplicationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapApplicationContext.class);

    public static void main(String[] args) {
        LOGGER.info("Bootstrapping Spring Application Context");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        SimpleSpringBean simpleSpringBean = context.getBean(SimpleSpringBean.class);
        LOGGER.info("Spring says: {}", simpleSpringBean.getMessage());

        AnotherSimpleSpringBean anotherSimpleSpringBean = context.getBean(AnotherSimpleSpringBean.class);
        LOGGER.info("Spring says: {}", anotherSimpleSpringBean.getMessage());
    }
}
