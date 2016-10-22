package no.acntech.tutorial.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class AnotherSimpleSpringBean {

    private String message;

    public AnotherSimpleSpringBean() {
        this("Hello Another Spring Configuration!");
    }

    public AnotherSimpleSpringBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
