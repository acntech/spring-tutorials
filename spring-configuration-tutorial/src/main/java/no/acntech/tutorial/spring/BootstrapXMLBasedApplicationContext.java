package no.acntech.tutorial.spring;

import no.acntech.tutorial.spring.bean.AnnotatedSpringBean;
import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootstrapXMLBasedApplicationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapXMLBasedApplicationContext.class);

    public static void main(String[] args) {
        LOGGER.info("Bootstrapping Spring Application Context");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        int beansFound = context.getBeanDefinitionCount();
        LOGGER.info("{} Spring Bean definitions loaded from spring.xml", beansFound);

        SimpleSpringBean simpleSpringBean = context.getBean(SimpleSpringBean.class);
        LOGGER.info("Spring says: {}", simpleSpringBean.getMessage());

        AnnotatedSpringBean annotatedSpringBean = context.getBean(AnnotatedSpringBean.class);
        LOGGER.info("Spring says: {}", annotatedSpringBean.getMessage());
    }
}
