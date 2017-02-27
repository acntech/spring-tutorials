package no.acntech.tutorial.spring;

import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import no.acntech.tutorial.spring.config.SpringConfig;
import no.acntech.tutorial.spring.config.TestSpringConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class BootstrapProfileAwareApplicationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapProfileAwareApplicationContext.class);

    public static void main(String[] args) {
        LOGGER.info("Bootstrapping Spring Application Context");

        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "test");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class, TestSpringConfig.class);

        SimpleSpringBean simpleSpringBean = context.getBean(SimpleSpringBean.class);
        LOGGER.info("Spring says: {}", simpleSpringBean.getMessage());
    }
}
