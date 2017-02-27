package no.acntech.tutorial.spring;

import no.acntech.tutorial.spring.bean.SimpleSpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BootstrapBeanFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapBeanFactory.class);

    public static void main(String[] args) {
        LOGGER.info("Bootstrapping Spring Bean Factory");

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        int beanDefinitionsFound = beanDefinitionReader.loadBeanDefinitions("spring.xml");
        LOGGER.info("{} Spring Bean definitions loaded from spring.xml", beanDefinitionsFound);

        SimpleSpringBean simpleSpringBean = beanFactory.getBean(SimpleSpringBean.class);
        LOGGER.info("Spring says: {}", simpleSpringBean.getMessage());
    }
}
