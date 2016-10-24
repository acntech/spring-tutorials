package no.acntech.tutorial.spring;

import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class BootstrapGroovyBasedApplicationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapGroovyBasedApplicationContext.class);

    public static void main(String[] args) {
        LOGGER.info("Bootstrapping Spring Application Context");

        ApplicationContext context = new GenericGroovyApplicationContext("spring.groovy");
        int beansFound = context.getBeanDefinitionCount();
        LOGGER.info("{} Spring Bean definitions loaded from spring.groovy", beansFound);

        SimpleSpringBean simpleSpringBean = context.getBean(SimpleSpringBean.class);
        LOGGER.info("Spring says: {}", simpleSpringBean.getMessage());
    }
}
