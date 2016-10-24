package no.acntech.tutorial.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedSpringBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnnotatedSpringBean.class);

    private String message;

    public AnnotatedSpringBean() {
        this("Hello Annotated Component Spring Configuration!");
    }

    public AnnotatedSpringBean(String message) {
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
