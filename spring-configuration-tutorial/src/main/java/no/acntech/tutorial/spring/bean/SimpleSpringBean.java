package no.acntech.tutorial.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleSpringBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleSpringBean.class);

    private String message;

    public SimpleSpringBean() {
    }

    public SimpleSpringBean(String message) {
        this.message = message;
        LOGGER.info("Bean created");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
