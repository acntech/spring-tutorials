package no.acntech.tutorial.spring.bean;

public class SimpleSpringBean {

    private String message;

    public SimpleSpringBean() {
    }

    public SimpleSpringBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
